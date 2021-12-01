package com.advent.of.code.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

    public static void challenge1() throws FileNotFoundException{
        File file = new File("src\\com\\advent\\of\\code\\day1\\numbers.txt");
        Scanner scan = new Scanner(file);

        int previousLine = 0, currentLine = 0;
        int howManyIncreases = 0;

        while(scan.hasNextLine()) {
            currentLine = Integer.parseInt(scan.nextLine());
            if(currentLine > previousLine) {
                howManyIncreases++;
            }
            previousLine = currentLine;
        }

        scan.close();

        // Because the first measurement is always bigger than 0, we need to subtract 1
        howManyIncreases--;

        System.out.println("The number of increases is: " + howManyIncreases);
    }

    public static void challenge2() throws FileNotFoundException{
        File file = new File("src\\com\\advent\\of\\code\\day1\\numbers.txt");
        Scanner scan = new Scanner(file);

        int line1 = Integer.parseInt(scan.nextLine());
        int line2 = Integer.parseInt(scan.nextLine());
        int lastSum = 0;

        int howManyIncreases = 0;

        while(scan.hasNextLine()) {
            int line3 = Integer.parseInt(scan.nextLine());

            int sumOfTheLastThreeLines = line1 + line2 + line3;
            if(sumOfTheLastThreeLines > lastSum) {
                howManyIncreases++;
            }
            lastSum = sumOfTheLastThreeLines;
            line1 = line2;
            line2 = line3;
        }

        scan.close();
        // Because the first measurement is always bigger than 0, we need to subtract 1
        howManyIncreases--;

        System.out.println("The number of three-measurement window increases is: " + howManyIncreases);
    }


    public static void main(String[] args) throws FileNotFoundException {
        challenge1();
        challenge2();
    }
}
