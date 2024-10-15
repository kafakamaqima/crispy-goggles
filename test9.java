package com.hhh.test;

import java.util.Random;

public class test9 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomindex = r.nextInt(chs.length);
            result = result + chs[randomindex];
        }
        result = result + r.nextInt(10);
        System.out.println(result);
    }
}
