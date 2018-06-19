package finalKeyword;


//Making an entire class final
public class Jurassic {
    public static void main(String[] args){
        Dinasour n = new Dinasour();
        n.f();
        n.i = 40;
        n.j++;
    }
}


class SmallBrain{}


final class Dinasour{
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f(){}
}

//! class Further extends Dinosour{}
//error: Cannot extend final class 'Dinosour'

