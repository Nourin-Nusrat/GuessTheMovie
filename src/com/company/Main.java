package com.company;


import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception{


        FileReader fileRead = new FileReader("movie.txt");
        Scanner file = new Scanner(fileRead);


        String string[] = new String[100];
        int length =0;
        while(file.hasNextLine())
        {
            string[length]= file.nextLine();
            length=length+1;
        }

        Random movie = new Random();
        int number = movie.nextInt(length);
        String stringName = new String(string[number]);
        char[] movieName = stringName.toCharArray() ;


        Game.Checkloop(movieName);
    }

}