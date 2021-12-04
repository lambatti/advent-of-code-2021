package com.advent.of.code.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day3 {

    public static void challenge1() throws FileNotFoundException {
        File file = new File("src\\com\\advent\\of\\code\\day3\\input.txt");
        Scanner scan = new Scanner(file);

        // first line is being scanned before the loop
        int numberOfLines = 1;

        String line0 = scan.nextLine();
        int numberLength = line0.length();
        int[] numberOfOnes = new int[numberLength];

        for (int i = 0; i < numberLength; i++) {
            if(line0.charAt(i) == '1')
                numberOfOnes[i]++;
        }

        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            for (int i = 0; i < numberLength; i++) {
                if(line.charAt(i) == '1')
                    numberOfOnes[i]++;
            }
            numberOfLines++;
        }
        scan.close();

        StringBuilder gammaRate = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();


        for (int i = 0; i < numberOfOnes.length; i++) {
            if(numberOfOnes[i] >= numberOfLines/2){
                gammaRate.append("1");
                epsilon.append("0");
            }
            else {
                gammaRate.append("0");
                epsilon.append("1");
            }
        }

        System.out.println("The power consuption equals to: " + Integer.parseInt(gammaRate.toString(), 2) * Integer.parseInt(epsilon.toString(), 2));
    }

    public static void challenge2() throws FileNotFoundException {
        File file = new File("src\\com\\advent\\of\\code\\day3\\input.txt");
        Scanner scan = new Scanner(file);

        scan.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        challenge1();
        challenge2();
    }
}
