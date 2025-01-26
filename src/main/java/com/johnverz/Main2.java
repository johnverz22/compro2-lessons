package com.johnverz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Greeting with first name and last name
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);

        // Simple calculator
        System.out.print("\nEnter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int result = 0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("The result is: " + result);

        // Distance conversion
        System.out.print("\nEnter a distance in km: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " km is " + miles + " mi");

        // Loop through a number
        System.out.print("\nEnter a number: ");
        int n = scanner.nextInt();
        System.out.println("Looping through numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // Reverse a word
        scanner.nextLine(); // Consume leftover newline
        System.out.print("\nEnter a word: ");
        String word = scanner.nextLine();
        String reversedWord = new StringBuilder(word).reverse().toString();
        System.out.println("The word in reverse order: " + reversedWord);

        // Save a message to a file
        System.out.print("\nEnter a message: ");
        String message = scanner.nextLine();
        try (FileWriter writer = new FileWriter("target/message.txt")) {
            writer.write(message);
            System.out.println("The message is saved in target/message.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the message.");
        }

        scanner.close();
    }
}
