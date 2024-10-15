package com.hhh.test;

public class test8 {
    public static void main(String[] args) {
        // 1.遍历每一个数
        int count = 0;
        for (int i = 101; i < 201; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i + "是素数");
                count++;
            }
        }
        System.out.println(count + "个素数");
    }
}