package access;
import access.cookie2.*;
public class ChocolateChip2 extends Cookie{
    public ChocolateChip2(){
        System.out.println("ChocolateCip2 constructor");
    }

    public void chomp(){ //proteced method
        bite();
    }

    public static void main(String[] args){
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
