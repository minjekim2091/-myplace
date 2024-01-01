package com.example.javaapplication;

public class CallByValue {

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("swap() 호출전: a= " + a + ",b= " + b);
    }
}
