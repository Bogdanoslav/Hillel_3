package com.hillel;

import java.util.Scanner;

public class FromEightToEleven {
    public static void main(String[] args) {
        //Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
        int [] odd = new int[10];
        int i = 0;
        int n = 1;
        while(i<odd.length){
            if(n % 2 !=0){
                odd[i] = n;
                if(i!= odd.length-1)
                    System.out.print(odd[i] + ", ");
                else
                    System.out.print(odd[i]);
                i++;
            }
            n++;
        }
        //Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("Введите размер массива N => ");
        int N = s.nextInt();
        int[] nums = new int[N];
        int min = 2147483647;
        for(int j = 0;j < nums.length;j++){
            nums[j] = (int)(Math.random() * 10);
            if(min > nums[j])
                min = nums[j];
            if(j!= nums.length-1)
                System.out.print(nums[j] + ", ");
            else
                System.out.print(nums[j]);
        }
        System.out.println();
        System.out.print("Min values : ");
        for(int j = 0; j < nums.length;j++){
            if(nums[j]==min){
                System.out.print(nums[j] + " ");
            }
        }
        //В массиве из задания 9. найти наибольший элемент.
        System.out.println();
        int max = -1;
        for(int j = 0; j < odd.length; j++){
            if(max<odd[j])
                max = odd[j];
        }
        System.out.print("Max values for odd array: ");
        for(int j = 0; j < odd.length; j++){
            if(max==odd[j])
                System.out.print(odd[j] + " ");
        }

        //Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
        System.out.println();
        System.out.println("SWITCH");
        int[] switchArray = new int[10];
        for(int j = 0; j < switchArray.length;j++){
            switchArray[j] = (int)(Math.random()*10-6);
            if(j!= switchArray.length-1)
                System.out.print(switchArray[j] + ", ");
            else
                System.out.print(switchArray[j]);
        }
        System.out.println();
        max = -2147483648;
        min = 2147483647;
        for(int j = 0; j<switchArray.length;j++){
            if(max<switchArray[j])
                max = switchArray[j];
            if(min>switchArray[j])
                min = switchArray[j];
        }
        System.out.print("MIN: " + min + " MAX " +  max);
        System.out.println();
        int temp;
        for(int j = 0; j<switchArray.length-1;j++){
            if(switchArray[j]==max){
                for(int k = j+1; k < switchArray.length; k++){
                    if(switchArray[k]==min){
                        temp = switchArray[j];
                        switchArray[j]=switchArray[k];
                        switchArray[k] = temp;
                    }
                }
            }
            else if(switchArray[j]==min){
                for(int k = j+1; k < switchArray.length; k++){
                    if(switchArray[k]==max){
                        temp = switchArray[j];
                        switchArray[j]=switchArray[k];
                        switchArray[k] = temp;
                    }
                }
            }
        }
        for(int j = 0; j < switchArray.length;j++) {
            if(j!= switchArray.length-1)
                System.out.print(switchArray[j] + ", ");
            else
                System.out.print(switchArray[j]);
        }
        //Найти среднее арифметическое всех элементов массива.
        double sum = 0;
        for(int j = 0; j < switchArray.length;j++){
            sum += switchArray[j];
        }
        System.out.println();
        System.out.println("Среднее арифметическое: " + sum/switchArray.length);
    }
}
