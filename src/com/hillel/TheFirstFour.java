package com.hillel;
import java.util.Scanner;

public class TheFirstFour {

    public static void main(String[] args) {
        //FOR нечетные числа
        System.out.println("FOR нечетные числа");
        for(int i = 1; i < 100; i++){
            if(i % 2 != 0)
                System.out.print(i + " ");
        }

        System.out.println();

        //FOR Факториал
        System.out.println("FOR Факториал");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n_save = n;
        int res = n;
        if(n==0 || n==1)
            res = 1;
        else{
            for(int i = 1; i < n_save; i++){
                res *= --n;
            }
        }
        System.out.printf("Fact(%d) = %d",n_save,res);
        System.out.println();

        //WHILE нечетные числа
        System.out.println("WHILE нечетные числа");
        n = 0;
        while(n < 100){
            if(n % 2 != 0)
                System.out.print(n + " ");
            n++;
        }

        //WHILE Факториал
        System.out.println();
        System.out.println("WHILE Факториал");
        n = s.nextInt();
        res = n;
        n_save = n;
        if(n==0 || n==1)
            res = 1;
        else{
            while(n!=1){
                res *= --n;
            }
            System.out.printf("Fact(%d) = %d",n_save,res);
        }

        //DO WHILE  нечетные числа
        System.out.println();
        System.out.println("DO WHILE нечетные числа");
        n = 0;
        do{
            if(n % 2 != 0)
                System.out.print(n + " ");
            n++;
        }while(n!=100);

        //DO WHILE Факториал
        System.out.println();
        System.out.println("DO WHILE Факториал");
        n = s.nextInt();
        res = n;
        n_save = n;
        if(n==0 || n==1)
            res = 1;
        else{
            do{
                res *= --n;
            }while(n!=1);
        }
        System.out.printf("Fact(%d) = %d",n_save,res);
    }
}
