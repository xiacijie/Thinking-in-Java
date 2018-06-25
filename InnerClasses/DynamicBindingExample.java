
class Human{
    void say(){
        System.out.println("hello human");
    }

}


class Boy extends Human{
    void say(){
        System.out.println("hello boy");
    }

    void boy(){
        System.out.println("boy");
    }
}


public class DynamicBindingExample {


    public static void main(String[] args){
        Human h = new Boy();
        h.say();
    }

}
