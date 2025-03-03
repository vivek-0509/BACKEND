package AdvanceJava;
import java.util.*;
import java.util.ArrayList;

public class Comparators {
    public static void main (String args []){

    //    Comparator<Integer> com =new Comparator<Integer>() {
    //       public int compare(Integer i,Integer j){
    //          if(i%10>j%10){
    //             return 1;
    //          }

    //          else{
    //             return -1;
    //          }
    //       }
    //    };


    //Using Lambda expression

    Comparator<Integer> com = (Integer i,Integer j) -> {
            
        return i>j ? 1: -1;
    };

        ArrayList <Integer> nums = new ArrayList<>();

        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums,com);

        System.out.print(nums);
    }
}
