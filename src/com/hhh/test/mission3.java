package com.hhh.test;

import java.util.Random;

public class mission3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 56, 66, 777, 0};
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