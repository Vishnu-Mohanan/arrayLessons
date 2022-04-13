package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Enter the size:");

	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();

	    int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");

        for (int j = 0; j < arr.length; j++){

            arr[j] = sc.nextInt();
        }

        System.out.println("The array elements are:");
        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }

    }
}
