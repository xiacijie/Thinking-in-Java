//Using finalize() to detect an object that has not been properly cleaned up
public class TerminationCondition {
    public static void main(String[] args){
        Book novel = new Book(true);
        //Properly cleanup;
        novel.checkIn();
        //Drop the reference, forget to clean up
        new Book(true);
        //Force grabage collection & finilization
        System.gc();
    }
}


class Book{
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }


    void checkIn(){
        checkedOut = false;
    }

    protected  void finalize(){
        if (checkedOut){
            System.out.println("Error: checked out");
            //Mormally, you'll also do this
            //super.finialize() // call the base-class version

        }

    }
}