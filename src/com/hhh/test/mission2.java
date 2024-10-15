package com.hhh.test;

import java.util.Scanner;

public class mission2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
