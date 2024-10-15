package com.hhh.test;

import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int count = 0;
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字");
            int guessnumber = sc.nextInt();
            count++;
            if (count == 10) {
                System.out.println("猜中了?(大概吧少年,你保底了...)");
                break;
            }
            if (guessnumber > number) {
                System.out.println("大了");
            } else if (guessnumber < number) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}