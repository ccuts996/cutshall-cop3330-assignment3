package ex45;
import java.io.*;
public class Files {
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

    public static String readFile(BufferedReader in) throws IOException {
        String line;
        StringBuilder data = new StringBuilder();
        while ((line = in.readLine()) != null) {
            data.append(line).append("\n");
        }

        return data.toString();
    }

    public static void writeToFile(String text, String fileName) throws IOException {
        File outfile = Files.getOutputFile(fileName);

        FileWriter outWriter = new FileWriter(outfile);
        outWriter.write(text);
        outWriter.close();
    }
}
