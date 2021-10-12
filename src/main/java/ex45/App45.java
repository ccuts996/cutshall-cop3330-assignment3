
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Chase Cutshall
 */
package ex45;

import java.io.*;
import java.util.Scanner;

public class App45 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(Files.getInputFile("exercise45_input.txt"));

        String fileData = Files.readFile(input);

        String outputString = WordReplacer.replace(fileData,"utilize" , "use");

        String outFileName = getString("Output file name? ");
        Files.writeToFile(outputString, outFileName);

    }

    private static String getString (String message) {
        System.out.print(message);
        return in.nextLine();
    }
}
