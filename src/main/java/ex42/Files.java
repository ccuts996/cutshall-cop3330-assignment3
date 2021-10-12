package ex42;

import java.io.*;

public class Files {

    public static BufferedReader getInputStream(String inputFileName) throws FileNotFoundException {
        return new BufferedReader(new FileReader(getProjectDirectory() + "\\input\\" + inputFileName));
    }

    private static File getProjectDirectory() {
        return new File(System.getProperty ("user.dir"));
    }
}