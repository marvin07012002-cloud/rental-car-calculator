package com.pluralsight;

import java.util.Scanner;

public class rentalCarCalculator {
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double totalCost = 0;
        System.out.println("Enter you pick up date");
        String date = myScanner.nextLine();

        System.out.println("How many days you want to rent");
        double rentDays = myScanner.nextInt();
        //String days = myScanner.nextLine();
        //double rentDays = Double.parseDouble(days);

        //double rentDays = Double.parseDouble(myScanner.nextLine());
        //double rentDays = myScanner.nextLine();
        totalCost = totalCost + rentDays * 29.99;
        myScanner.nextLine();

        System.out.println("You want an Electronic toll tag for 3.95$/day (yes/no)?");
        String tag = myScanner.nextLine();
        if (tag.equalsIgnoreCase("yes")) {
            totalCost = totalCost + (rentDays * 3.95); }

        System.out.println("Do you want GPS for 2.95$/day (yes/no)?");
        String gps = myScanner.nextLine();
        if(gps.equalsIgnoreCase("yes")){
            totalCost = totalCost + (rentDays * 2.95); }

        }





    }



