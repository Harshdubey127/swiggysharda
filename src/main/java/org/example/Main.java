package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Sharda Swiggy Delivery App Mr. Harsh");
        System.out.println();

        // Display menu options
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Restaurants Choose from whic h you wanna enter"+"\n");
        Restro.displayMenu("C:\\Users\\harsh\\IdeaProjects\\swiggysharda\\data\\Restro1.csv");
        System.out.println("\n"+"Choose resturant to continue");
        int restro = scanner.nextInt();
        System.out.println();

        Dish.menu(restro);
        Dish.displayMenu("C:\\Users\\harsh\\IdeaProjects\\swiggysharda\\data\\Menu.csv");

        System.out.println("\n"+"Choose Dishes you want to eat by their Dish Id");



        scanner.close();
    }
}