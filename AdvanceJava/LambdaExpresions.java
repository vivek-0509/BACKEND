package AdvanceJava;

//annotation done to know compiler that it is a functinal interface therefore it can only have one method
@FunctionalInterface
interface A {
    void show(int i);
}

interface B{
    int add(int i,int j);
}

public class LambdaExpresions {


     public static void main(String args []){
       
        A obj = (int i) -> {
            System.out.println("Name" + i);
        };

        obj.show(1);

       // if you are not mentioning return  then it is automatically returning the ans
        B obj1= (i, j) -> i+j;
       
     }
}
