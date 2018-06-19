package finalKeyword;

//blank final fields
public class BlankFinal {
    private final int i = 0; // Initialized final
    private final int j; // blank final
    private final Poppet p; // blank final reference
    //Blank finals must be initialized in the constructor

    public BlankFinal(){
        j = 1; // Initialize blank final
        p = new Poppet(1); // Initialize blank final reference
    }

    public BlankFinal(int x){
        j = x; // initialize blank final
        p = new Poppet(x); // initialize blank final reference
    }

    public static void main(String[] args){
        new BlankFinal();
        new BlankFinal(47);
    }
}


class Poppet{
    private int i;
    Poppet(int ii){
        i = ii;
    }
}

