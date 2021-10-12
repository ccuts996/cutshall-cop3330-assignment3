package ex46;
import java.io.*;
public class Files {
    public static FileReader getInputFile(String inputFileName) throws FileNotFoundException {
        return new FileReader(getProjectDirectory() + "\\input\\" + inputFileName);
    }

    private static File getProjectDirectory() {
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
}
