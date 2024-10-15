package com.hhh.test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
            System.out.print(number + " ");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数组中所有数据的和为" + sum);
        int aver = sum / arr.length;
        System.out.println("数组的平均数为" + aver);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (aver > arr[i]) {
                count++;
                // System.out.println(arr[i]);
            }
        }
        System.out.println("数组中比平均数小的数有" + count + "个");
    }
}
