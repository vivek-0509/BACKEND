package AdvanceJava;

import java.util.*;

//creating my own exception need to extend parent class in order to make your own exception

class VivekException extends Exception {
    VivekException(String str) {
        super(str);
    }
}

public class ExceptionHandling {
    public static void main(String args[]) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;

            // use throw if you want to call catch block despite not having any exception

            if (j == 0) {

                throw new VivekException("I dont want to print zero");
            }
        } catch (VivekException e) {
            j = 18 / 1;
            System.out.println(e);
        }

        catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
    }
}
