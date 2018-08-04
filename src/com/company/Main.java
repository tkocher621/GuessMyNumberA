package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int min = 1;
    int max = 100;

    Random random = new Random();
    Scanner reader = new Scanner(System.in);
    int randomNum = min + random.nextInt(max);

    System.out.println("Guess a number between 1 and 100");

    int guess = reader.nextInt();

    if (guess == randomNum) {
        System.out.println("You got it!");
    }
    else if (guess < randomNum) {
        System.out.println("Guess is too low");
    }
    else if (guess > randomNum){
        System.out.println("Guess is too high");
    }

    }
}
