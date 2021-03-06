package com.company;

public class PascalTriangle {
    private int ubound;
    private long C[][];

    //инициализация треугольника
    public PascalTriangle(int ubound){
        if(ubound > 66){
            throw new RuntimeException("Data overflow");
        }
        this.ubound = ubound;
        C = new long[ubound+1][ubound+1];
        for (int n = 0; n <= ubound; n++) {
            //первый и последний элемент в строке равен 1
            C[n][0] = C[n][n] = 1;
            //далее вычисляем внутреннюю часть
            for (int k = 1; k < n; k++) {
                C[n][k] = C[n-1][k-1] + C[n-1][k];
            }
        }
    }

    //вывод треугольника в консоль
    public void show(){
        for (int n = 0; n <= ubound; n++) {
            for (int k = 0; k <= n; k++) {
                System.out.print(C[n][k] + " ");
            }
            System.out.println();
        }
    }

    //метод, возвращающий кол-во сочетаний из n по k
    public long get(int n,int k){
        return C[n][k];
    }
}