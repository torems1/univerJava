package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonachi {
        public static void main(String[] args) {
            Integer size=new Integer(10);
            int[] array3 = new int[size];
            array3[0] = 1;
            array3[1] = 2;
            for (int i = 2; i < size; i++) {
                int y = array3[i - 1] + array3[i - 2];
                array3[i] = y;
            }
            System.out.println(Arrays.toString(array3));
        }
    }

