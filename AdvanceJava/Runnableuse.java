package AdvanceJava;
import java.lang.Runnable;

// package AdvanceJava;

import java.util.*;


class  E implements Runnable {

    public void run(){
      for(int i=0;i<10;i++){
        System.out.println("Hi");
        try{
          Thread.sleep(1);
        }

        catch(InterruptedException e){
         System.out.println(e);
        }
        
      }
    }
}

class  F implements Runnable {

    public void run(){
      for(int i=0;i<10;i++){
        System.out.println("Hello");
        try{
          Thread.sleep(1);
        }

        catch(InterruptedException e){
         System.out.println(e);
        }
      }
    }
}

public class Runnableuse{
  
    public static void main (String args[]){
       
        E obj3=new E();
        F obj4=new F();

        Thread t1=new Thread(obj3);
        Thread t2=new Thread(obj4);

        t1.start();
        t2.start();
    }
}
