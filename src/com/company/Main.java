package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Create a new project in IntelliJ IDEA named ArrayPractice
        // Initialize your project as a Git repository and be sure to add and commit all changes as you work
        // Declare an array named dailyAverageTemp
        // Instruct the user to input daily average temperatures
        // (in degrees Fahrenheit) for 7 days
        //Each time the user inputs a value, add it to your dailyAverageTemp array


        double[] dailyAverageTemp = new double[7];
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < dailyAverageTemp.length; i++) {
            System.out.println("Enter a temperature for day " + (i + 1) + ": ");
            dailyAverageTemp[i] = userInput.nextDouble();
        }


        for (int i = 0; i < dailyAverageTemp.length; i++) {
            System.out.println ( "Daily average temperature for day " + (i + 1) + ": " + dailyAverageTemp[i]);
        }



    }
}
