/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Chase Cutshall
 */
package ex43;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App43 {

    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String title = getString("Site name: ");
        title = title.replace(' ', '-');
        String author = getString("Author: ");
        boolean js = getYesOrNo("Do you want a folder for JavaScript? ");
        boolean css = getYesOrNo("Do you want a folder for CSS? ");

        new WebsiteGenerator(title,author,js,css);

    }

    private static String getString (String message) {
        System.out.print(message);
        return in.nextLine();
    }

    private static boolean getYesOrNo(String message) {
        System.out.print(message);
        if(in.nextLine().toLowerCase(Locale.ROOT).charAt(0) == 'y')
            return true;

        return false;
    }


}
