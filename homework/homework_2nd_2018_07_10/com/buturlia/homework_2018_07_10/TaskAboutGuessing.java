package com.buturlia.homework_2018_07_10;

import java.util.Random;
import java.util.Scanner;

public class TaskAboutGuessing {
    private String alphabetic = "abcdefghijkslmopqrstuvwxwyz";
    private int guess;

    public TaskAboutGuessing() {
        Random random = new Random();
        this.guess = random.nextInt(alphabetic.toCharArray().length - 1);
    }

    public void tryToGuestt()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make a guess ");
        char proposion = scanner.next().toCharArray()[0];


        while(alphabetic.indexOf(proposion) != guess){
            System.out.println("Wrong letter, try more");
            if (alphabetic.indexOf(proposion) > guess)
            {
                System.out.println("Guessed letter come earler");
            }else {
                System.out.println("Guessed letter com later");
            }
            proposion = scanner.next().toCharArray()[0];
        }
        System.out.println("Right! We guessed " + alphabetic.toCharArray()[guess]);


    }
}
