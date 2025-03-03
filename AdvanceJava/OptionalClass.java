package AdvanceJava;

import java.util.*;
import java.lang.reflect.Array;
import java.util.List;

//Optional class is made to avoid null pointer exception
public class OptionalClass {
    public static void main(String args[]) {

        List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishore");

        String name = names.stream().filter(str -> str.contains("x")).findFirst().orElse("Say fuck off");

        System.out.println(name);
    }
}
