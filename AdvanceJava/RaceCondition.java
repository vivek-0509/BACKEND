package AdvanceJava;
import java.lang.Runnable;

// package AdvanceJava;

import java.util.*;

class Counter {
  int count;

  //using synchronized to make sure that only one thread can work on this method at a time

  public synchronized void increment(){
    count=count+1;
  }
}


class  G implements Runnable {
  Counter c;

    G(Counter c) {  // Accepting shared Counter instance
        this.c = c;
    }
    public void run(){
      for(int i=0;i<1000;i++){
        
         c.increment();
      }
    }
}

class  H implements Runnable {
  Counter c;

    H(Counter c) {  // Accepting shared Counter instance
        this.c = c;
    }
    public void run(){
      for(int i=0;i<1000;i++){
         c.increment();
      }
    }
}

public class RaceCondition {
  
    public static void main (String args[]) throws InterruptedException{
      Counter c=new Counter();
        G obj5=new G(c);
        H obj6=new H(c);

        Thread t5=new Thread(obj5);
        Thread t6=new Thread(obj6);

        t5.start();
        t6.start();

        //to join to make wait main thread to wait till other thread finish there execution

        t5.join();
        t6.join();


        System.out.println(c.count);
    }
}
