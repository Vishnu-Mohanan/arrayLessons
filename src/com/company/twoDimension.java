package com.company;

import java.util.Scanner;

public class twoDimension {

        public static void main(String[] args) {
            System.out.println("Enter the rows:");

            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();

            System.out.println("Enter the col:");
            int col = sc.nextInt();

            int[][] arr = new int[row][col];

            for (int j = 0; j < row; j++){
                for(int k = 0; k < col; k++ ) {
                    arr[j][k] = sc.nextInt();
                }
            }

            System.out.println("The array elements are:");
            for(int i = 0; i < row; i++){
                for(int l = 0; l < col; l++) {
                    System.out.print(""+ arr[i][l] +" ");
                }
                System.out.println("");
            }
        }
    }

