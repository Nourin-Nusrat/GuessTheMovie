package com.company;

import java.util.Scanner;
public class Game {



    public static void Checkloop(char[] randomMovieName){


        char userInput;


        int wrongGuess = 0;
        int point = 0;
        int remainLetter = 0;
        boolean result = false;
        char[] wrongGuesses = new char[50];
        Scanner scan = new Scanner(System.in);
        char[] copyMovieName = new char[randomMovieName.length];

        System.out.print("\nYou are guessing:");
        for(int i=0; i<randomMovieName.length; i++){
            if(randomMovieName[i] != ' '){
                copyMovieName[i]='_';
            }
            else {
                copyMovieName[i] = ' ';
            }
            System.out.print(copyMovieName[i]);
        }
        System.out.print("\n");


        while(!result){
            System.out.print("you have guessed ("+ wrongGuess + ") wrong letters ");

            for(int i = 0; wrongGuesses[i] != '\0' ; i++){
                System.out.print(wrongGuesses[i] + " ");
            }

            System.out.print("\n");
            System.out.print("Guess a letter :");

            userInput = scan.next().charAt(0);
            for(int i=0;i<copyMovieName.length;i++){
                if(userInput == randomMovieName[i]){


                    if(randomMovieName[i]!=copyMovieName[i])
                        point++;
                    copyMovieName[i] = userInput;
                }
                if(randomMovieName[i]!=copyMovieName[i]){
                    remainLetter++;
                }

            }
            if(point==0){
                wrongGuesses[wrongGuess] = userInput;
                wrongGuess++;
            }

            if(remainLetter==0){
                System.out.println("You win!");
                System.out.println("You have guessed '" + String.valueOf(randomMovieName) + "' correctly");
                break;
            }
            if(wrongGuess >= 10)
            {
                System.out.println("You have lost 10 points. Game over!");
                break;
            }
            System.out.print("You are guessing:");
            for(int i = 0; i < randomMovieName.length; i++)
            {
                System.out.print(copyMovieName[i]);
            }
            System.out.print("\n");
            point = 0;
            remainLetter = 0;


        }

    }
}
