//Using final with method arguments
package finalKeyword;

public class FinalArguments {
    void with(final Gizmo g){
        //! g = new Gizmo(); // Illegal -- g is final
    }

    void without(Gizmo g){
        g = new Gizmo(); // Ok
        g.spin();
    }


    //void f(final int i){i ++}  //cannot change
    //you can only read from a final primitive

    int g(final int i){
        return i + 1;
    }


    public static void main(String[] args){
        FinalArguments bf = new FinalArguments();
        bf.with(null);
        bf.without(null);
    }
}



class Gizmo{
    public void spin(){}
}