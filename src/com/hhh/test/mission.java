package com.hhh.test;

import java.util.Scanner;

public class mission {
    public static void main(String[] args) {
        int[] scoreArr = getScore();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print(scoreArr[i] + " ");

        }
    }
    public static int[] getScore() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("输入成绩不合法,当前i为" + i);
            }

        }
        return scores;
    }
}
