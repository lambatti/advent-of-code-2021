package com.advent.of.code.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {

    public static void challenge1() throws FileNotFoundException {
        File file = new File("src\\com\\advent\\of\\code\\day2\\input.txt");
        Scanner scan = new Scanner(file);

        int depth = 0;
        int horizontalPosition = 0;

        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            int value = Character.getNumericValue(line.charAt(line.length() -1));
            switch(line.charAt(0)) {
                case 'f' -> horizontalPosition += value;
                case 'd' -> depth += value;
                case 'u' -> depth -= value;
            }
        }

        scan.close();

        int finalPosition = horizontalPosition * depth;
        System.out.println("Horizontal position multiplied by the depth equals to: " + finalPosition);
    }

    public static void challenge2() throws FileNotFoundException {
        File file = new File("src\\com\\advent\\of\\code\\day2\\input.txt");
        Scanner scan = new Scanner(file);

        int depth = 0;
        int horizontalPosition = 0;
        int aim = 0;

        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            int value = Character.getNumericValue(line.charAt(line.length() -1));
            switch(line.charAt(0)) {
                case 'f' -> {
                    horizontalPosition += value;
                    depth += value*aim;
                }
                case 'd' -> aim += value;
                case 'u' -> aim -= value;
            }
        }

        scan.close();

        int finalPosition = horizontalPosition * depth;
        System.out.println("Horizontal position multiplied by the depth equals to: " + finalPosition);
    }

    public static void main(String[] args) throws FileNotFoundException {
        challenge1();
        challenge2();
    }
}
