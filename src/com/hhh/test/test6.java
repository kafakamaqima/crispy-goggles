package com.hhh.test;

public class test6 {
    public static void main(String[] args) {
        double area1 = getArea(9.8, 5.99);
        double area2 = getArea(8.9, 7.3);
        if (area1 > area2) {
            System.out.println("第一个大");
        } else if (area1 < area2) {
            System.out.println("第二个大");
        } else {
            System.out.println("两个相等");
        }
    }

    public static double getArea(double len, double width) {
        double Area = len * width;
        return Area;
    }

}
