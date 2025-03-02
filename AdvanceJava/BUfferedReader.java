package AdvanceJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BUfferedReader {

    public static void main(String args[]) {
        System.out.println("Hello");

        InputStreamReader in = new InputStreamReader(System.in);

        BufferedReader bf = new BufferedReader(in);

        // converting to int because it will input as string
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        // bf is a resource since it can read anything files or any other input ans in
        // order to read we open that file so its our responsibity to close it so use
        // bf.close()
        bf.close();

    }
}
