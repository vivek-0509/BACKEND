package AdvanceJava;
import java.util.*;

enum Status{
    pending,completed,Running,success;
}

enum Laptop{
    MacBook(2000),Xms(1000),ThinkPad();

    private int price;
    
    //Use default contructor to assign some value so that if particular variable does not have price it will use the by default set values
    Laptop(){
        this.price=500;
    }
    
    //paramaterized constructor
    Laptop(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }
}

public class enumss {

    public static void main (String args []){
        Status s= Status.success;
        
        // System.out.println(s);

        // Status [] ss = Status.values();
        
        // for( Status n: ss){
        //     System.out.println(n);
        // }

        switch(s){
            case Running:
               System.out.println("All good");
               break;
            
            case pending:
               System.out.println("Working on it");
               break;
            
            case completed:
               System.out.println("Thanks");
               break;

            default :
               System.out.println("Done");   
               break;
            }



            Laptop lap = Laptop.MacBook;


            for(Laptop laps : Laptop.values()){
                System.out.println(laps.getPrice());
            }

            
    }
}
