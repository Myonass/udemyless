package classes;

import java.util.Arrays;

public class demonstr {
    public static void main(String[] args){
        dynaarr Dynaarr = new dynaarr();

        Dynaarr.add(0);
        Dynaarr.add(1);
        Dynaarr.add(2);
        Dynaarr.add(3);
        Dynaarr.add(4);
        Dynaarr.add(5);

        System.out.println(Arrays.toString(Dynaarr.result));
        System.out.println(Dynaarr.count);
    }

}
