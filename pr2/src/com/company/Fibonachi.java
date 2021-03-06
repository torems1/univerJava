package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность ");
        int N = in.nextInt();
        int[] array3 = new int[N];
        System.out.println("Введите первый элемент ");
        int a = in.nextInt();
        array3[0] = a;
        System.out.println("Введите второй элемент ");
        int b = in.nextInt();
        array3[1] = b;
        for (int i = 2; i < N; i++) {
            int y = array3[i - 1] + array3[i - 2];
            array3[i] = y;
        }
        System.out.println(Arrays.toString(array3));
    }
}