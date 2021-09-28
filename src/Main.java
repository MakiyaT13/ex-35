/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Makiya Thomas
 */

import java.util.Random;
import java.util.Scanner;class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[50];
        int i = 0;
        while (i < 50) {
            System.out.print("Enter Name: ");
            names[i] = input.nextLine();
            if (names[i].equals("done")){
                break;
            }
            i++;
        }

        Random rand = new Random();
        int num = rand.nextInt(i);

        System.out.printf("The winner is... %s", names[num]);
    }
}