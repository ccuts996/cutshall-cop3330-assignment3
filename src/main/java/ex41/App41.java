/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Chase Cutshall
 */

package ex41;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class App41 {
    public static void main(String[] args) throws IOException {
        BufferedReader inFile = null;
        PrintStream console = System.out;

        try{

            inFile = new BufferedReader( getInputFile("exercise41_input.txt"));

            ArrayList<String> names = NameSorter.getNames(inFile);

            Collections.sort(names);

            File outputFile = getOutputFile("exercise41_output.txt");

            String output = NameSorter.getOutput(names);

            System.setOut(new PrintStream(outputFile));
            System.out.println(output);

        }
        catch (FileNotFoundException io) {
            System.out.println("ERROR: FILE NOT FOUND");
        }
        finally {

            try {
                inFile.close();

                System.setOut(console);
            }
            catch (NullPointerException npe) {
                npe.printStackTrace();
            }
        }
    }


    public static File getOutputFile(String outputFileName) throws IOException {
        if(!new File(getProjectDirectory() + "\\output").exists()) {
            File outputDirectory = new File(getProjectDirectory() + "\\output");
            outputDirectory.mkdir();
        }
        File outputFile = new File(getProjectDirectory() + "\\output\\" + outputFileName);
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }
        return outputFile;
    }

    public static FileReader getInputFile(String inputFileName) throws FileNotFoundException {
        return new FileReader(getProjectDirectory() + "\\input\\" + inputFileName);
    }

    public static File getProjectDirectory() {
        return new File(System.getProperty ("user.dir"));
    }


}