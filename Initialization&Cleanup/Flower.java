//Calling constructors with "this"
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    void print(String s){
        System.out.println(s);
    }
    Flower(int petals){
        petalCount = petals;
        print("Construcot w/ int arg only, petalCount= "+petalCount);

    }

    Flower(String ss){
        print("Constructo w/ String arg only, s = "+ss);
        s = ss;
    }

    Flower(String s, int petals){
        this(petals);
//        this(s); cannot call two!
        this.s = s;
        print("String & int args");
    }

    Flower(){
        this("hi",47);
    }

    void printPetalCount(){
//      this(11); this cannot inside non-constructor!
        print("petalCount = "+petalCount +" s = "+s);
    }

    public static void main(String[] args){
        Flower x = new Flower();
        x.printPetalCount();
    }
}
