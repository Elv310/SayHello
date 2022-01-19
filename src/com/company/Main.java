package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	whatIsYourName();
	whatIsYourFullName();
    }

    public static void whatIsYourName (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is Your Name ");
        String userInput = scanner.nextLine();

        System.out.println("Hello, nice to meet you"  + userInput);
        System.out.println(userInput);
    }

    public static void whatIsYourFullName(){
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("What is Your First Name?");
        String userInput2 = scanner2.nextLine();



        System.out.println("What is your last name?");
        String userInput3 = scanner2.nextLine();

        System.out.println("It is so nice to formally meet you " + userInput2 +" "+ userInput3);
    }
}
