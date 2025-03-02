package AdvanceJava;
import java.util.*;

class  C extends Thread{

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

class  D extends Thread{

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

public class Threadss{
  
    public static void main (String args[]){
       
        C obj1=new C();
        D obj2=new D();

        obj1.setPriority(10);

        obj1.start();
        obj2.start();
    }
}
