package com.company;
import java.util.Scanner;
public class Main {

public static void main(String[] args) {

    Scanner enter = new Scanner(System.in);
    System.out.println("Введите высоту");
    Integer x = enter.nextInt();

    System.out.println("Введите высоту");
    Integer y = enter.nextInt();

    Integer height = new Integer(x);
    Integer width = new Integer(y);
    Long triangle[][] = new Long[height][width];
    for (int i = 0; i < height; i++) {
        triangle[i][0] =(long)1;
        for (int j = 1; j < width; j++) {
            triangle[i][j] = j<i ? triangle[i-1][j] + triangle[i-1][j-1] : 0;
        }
        triangle[i][i] =(long)1;
    }
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            if (triangle[i][j] != 0) System.out.print(triangle[i][j] + " ");
        }
        System.out.println("");
    }
}
}
