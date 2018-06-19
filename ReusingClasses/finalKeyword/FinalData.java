// The effect of final on fields

package finalKeyword;


import java.util.*;

public class FinalData {
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id){
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    public static final int VALIUE_THREE = 39;

    private final int i4 = rand.nextInt(20);
    static final  int INT_5 = rand.nextInt(20);

    private Value v1 =  new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);


    private final int[] a = {1,2,3,4,5,6};
    public String toString(){
        return id +": " + "i4 = "+i4 + ", INT_5 = " + INT_5;
    }
}

class Value{
    int i;// package access
    public Value(int i){
        this.i = i;
    }
}
