package com.hillel;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число =>");
        int n = s.nextInt();
        for(int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d",n,i,n*i);
            System.out.println();
        }
    }
}
