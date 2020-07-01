package com.hillel;

public class Chessing {
    public static void main(String[] args) {
        boolean isWhite = true;
        for(int i = 0; i < 8;i++){
            for(int j = 0; j < 8;j++){
                if(isWhite) {
                    System.out.print("W ");
                    isWhite = false;
                }
                else{
                    System.out.print("B ");
                    isWhite = true;
                }
            }
            isWhite = !isWhite;
            System.out.println();
        }
    }
}
