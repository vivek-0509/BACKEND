package AdvanceJava;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApi {
    public static void main (String args []){

        List <Integer> nums = Arrays.asList(4,5,7,3,2,6);

        //Create interface referenece

        Stream<Integer> s1=nums.stream();

        Stream<Integer> s2 =s1.filter(n -> n%2==0);

        //use map to perform various operations on stream

        Stream<Integer> s3=s2.map(n -> n*2);
 
        s2.forEach(n -> System.out.println(n));
    }
}
