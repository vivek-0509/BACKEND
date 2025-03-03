package AdvanceJava;
import java.util.*;

public class MethodReference {
     public static void main(String args[]){
        List <String> names=Arrays.asList("Navin","Harsh","Vivek");
        
        //basic Syntax is Class name :: method name
        List<String> UNames= names.stream().map(String :: toUpperCase).toList();

        UNames.forEach(System.out::println);
     }
}
