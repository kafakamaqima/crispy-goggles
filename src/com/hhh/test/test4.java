package com.hhh.test;

import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        int[] arr = { 114514, 1314, 622, 520, 1111, 10101 };
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomindex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomindex];
            arr[randomindex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
