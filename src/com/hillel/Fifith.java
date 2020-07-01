package com.hillel;

import java.util.Scanner;

public class Fifith {
    public static void main(String[] args) {
        //Даны переменные x и n вычислить x^n.
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(Pow(x,n));

    }
    public static int Pow(int x, int n){
        if(n==0)
            return 1;
        for(int i = 0; i < n-1; i++){
            x *= n;
        }
        return x;
    }
}
