package com.advent.of.code.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) throws FileNotFoundException {
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
}
