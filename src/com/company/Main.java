package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	whatIsYourName();
    }

    public static void whatIsYourName (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is Your Name ");
        String userInput = scanner.nextLine();

        System.out.println("Hello, nice to meet you"  + userInput);
        System.out.println(userInput);
    }
}
