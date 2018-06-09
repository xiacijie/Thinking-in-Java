package Enumerated_Types;


public class EnumOrder {
    public static void main(String[] args){
        for(Spiciness s : Spiciness.values())
            System.out.println(s+", ordingal "+s.ordinal());
    }
}
