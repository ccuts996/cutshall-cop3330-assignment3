package ex41;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;

public class NameSorterTest extends TestCase {

    public void testGetOutput() {
        ArrayList<String> test = new ArrayList<>();
        test.add("Alf");
        test.add("Troy");
        test.add("Robert");
        test.add("Cameron");
        Collections.sort(test);

        String expected = "Total of 4 names\n-----------------\nAlf\nCameron\nRobert\nTroy\n";
        String actual = NameSorter.getOutput(test);

        assertEquals(expected,actual);
    }
}