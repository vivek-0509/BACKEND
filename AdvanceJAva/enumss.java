package AdvanceJAva;
import java.util.*;

enum Status{
    pending,completed,Running,Failed;
}

public class enumss {

    public static void main (String args []){
        Status s= Status.Running;
        
        System.out.println(s);

        Status [] ss = Status.values();
        
        for( Status n: ss){
            System.out.println(n);
        }
    }
}
