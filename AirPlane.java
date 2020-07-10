package com.AirLine;

import java.util.Scanner;

public class AirPlane {
    public static void main(String[]  args) {

        boolean[] seat = new boolean[10];
        int economyCount = 1;
        int firstCount = 1;

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Please type 1 for First Class and Please type 2 for Economy: ");
            int reply = input.nextInt();
            if(reply == 1) {
                for(int i = 0;i < 5;i ++) {
                    if(seat[i] == false) {
                        seat[i] = true;
                        firstCount++;
                        System.out.println("You are in the First Class section. Your seat number is: " + (i + 1));
                        break;
                    }
                    if(firstCount > 5){
                        System.out.print("First Class section is full. Enter 2 to be placed in the Economy section");
                        break;
                    }
                }
            }
            else if(reply == 2) {
                for(int j = 5;j < 10;j++) {
                    if(seat[j] == false) {
                        seat[j] = true;
                        economyCount ++;
                        System.out.println("You are in the Economy section. Your seat number is: " + (j + 1));
                        break;
                    }
                    if(economyCount > 5){
                        System.out.print("Economy section is full. Enter 1 to be placed in the First Class section");
                        break;
                    }
                }

            }
            if(economyCount > 5 && firstCount > 5 ) {
                System.out.println("All sections are full");
                System.out.println("Next flight leaves in 3 hours.");
                break;
            }
        }
    }
}
