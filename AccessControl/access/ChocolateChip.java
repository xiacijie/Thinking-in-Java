//Cannot use package-access member from another package

package access;
import access.dessert.*;

public class ChocolateChip extends Cookie{
    public ChocolateChip(){
        System.out.println("ChocolateChip constructor");
    }

    public void chomp(){
//        bite(); cannot access bite
    }

    public static void main(String[] args){
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
