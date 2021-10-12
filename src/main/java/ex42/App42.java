/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Chase Cutshall
 */
package ex42;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;

public class App42 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = Files.getInputStream("exercise42_input.txt");
        LinkedList<String> fileData = loadFileData(in);
        LinkedList<Names> name = createNames(fileData);

        System.out.println(Names.getTable(name));
    }


    private static LinkedList<String> loadFileData(BufferedReader in) throws IOException {
        LinkedList<String> fileData = new LinkedList<>();
        String line;
        while((line = in.readLine()) != null) {
            fileData.add(line);
        }
        return fileData;
    }


    public static LinkedList<Names> createNames(LinkedList<String> fileData) {
        LinkedList<Names> name = new LinkedList<>();
        for(String data : fileData) {
           name.add(new Names(data));
        }
        return name;
    }


}
