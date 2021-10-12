/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Chase Cutshall
 */
package ex46;

import java.io.BufferedReader;
import java.io.IOException;
public class App46 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(Files.getInputFile("exercise46_input.txt"));
        String fileData = Files.readFile(input);

        WordCounter counter = new WordCounter();

        counter.addWords(fileData);

        System.out.println(counter.toGraph());

    }
}
