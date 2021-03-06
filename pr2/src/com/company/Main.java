package com.company;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два значения");
        int x, y;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Сумма " + Integer.toHexString(x + y));
        System.out.println("Разность " + Integer.toHexString(x - y));
        System.out.println("Произведение " + Integer.toHexString(x * y));
        System.out.println("Частное " + Integer.toHexString(x / y));
        System.out.println("Постфикс инкремент Х " + Integer.toHexString(x++));
        System.out.println("Постфикс декримент Y " + Integer.toHexString(y--));
        System.out.println("Префикс инкремент Х " + Integer.toHexString(++x));
        System.out.println("Префикс декримент Y " + Integer.toHexString(++y));
        System.out.println("Побитовое НЕ - было " + Integer.toBinaryString(x) + " Стало " + Integer.toBinaryString(~x));
        System.out.println("Побитовое И " + Integer.toBinaryString(x & y));
        System.out.println("Побитовое ИЛИ " + Integer.toBinaryString(x | y));
        System.out.println("Побитовое исключающие ИЛИ " + Integer.toBinaryString(x ^ y));

        System.out.println("Введите 3 значения");
        int z, t, l;
        z = in.nextInt();
        t = in.nextInt();
        l = in.nextInt();
        System.out.println("Среднее арифмитическое " + ((z + t + l) / 3));
        int max = Math.max(z, t);
        if (max > l) {
            System.out.println("Максимальное число " + max);
        } else System.out.println("Максимальное число " + l);
        System.out.println("Введите длину массива");
        int n = in.nextInt();
        final int k = 100;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ((int) (Math.random() * k) - 0);
            Arrays.sort(array);
            System.out.println(array[i]);
        }
        int[] array2 = Arrays.stream(array).filter(predicate -> predicate % 3==0).toArray();
        System.out.println("Элементов делящихся на 3= "+ array2.length);
        int[] array3 = Arrays.stream(array).filter(predicate-> predicate %2!=0
                && predicate %3!=0
                && predicate %5!=0
                && predicate %7!=0).toArray();
        System.out.println("Простые числа= "+ array3.length);
        }
    }