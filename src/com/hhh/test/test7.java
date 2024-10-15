package com.hhh.test;

public class test7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int[] copyArr = copyOfRange(arr, 1, 9);
        System.out.print("[");
        for (int i = 0; i < copyArr.length; i++) {
            if (i == copyArr.length - 1) {
                System.out.print(copyArr[i]);
            } else {
                System.out.print(copyArr[i] + ",");
            }
        }
        System.out.println("]");
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int index = 0;
        int[] newArr = new int[to - from];
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

}
