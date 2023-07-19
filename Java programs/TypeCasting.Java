package com.krishna;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte b = 67;
        char c = 'a';
        short s = 1864;
        int i = 864564;
        float f = 6.66f;
        double d = 1.4321;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
