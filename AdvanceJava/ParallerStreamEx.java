package AdvanceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallerStreamEx {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(10000);

        Random ran = new Random();

        for (int i = 0; i < 10000; i++) {
            int randomNo = ran.nextInt(100);

            nums.add(randomNo);
        }

        // int sum1 = nums.stream().map(n -> n*2).reduce(0,(c,e) -> c+e);

        // another method to do which at back usesn reduce only but syntax is bit esay

        long startSeq = System.currentTimeMillis(); // to get the current time

        int sum2 = nums.stream().map(n -> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }
            return n * 2;
        }).mapToInt(i -> i).sum();

        long endSeq = System.currentTimeMillis();
        // using parallel stream

        long startSeq2 = System.currentTimeMillis();
        int sum3 = nums.parallelStream().map(n -> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }
            return n * 2;
        }).mapToInt(i -> i).sum();

        long endSeq2 = System.currentTimeMillis();
        System.out.println(sum2 + " " + sum3);

        System.out.println(endSeq - startSeq);
        System.out.println(endSeq2 - startSeq2);
    }
}
