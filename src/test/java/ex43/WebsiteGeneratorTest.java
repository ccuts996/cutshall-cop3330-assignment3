package ex43;

import junit.framework.TestCase;
import java.io.IOException;

public class WebsiteGeneratorTest extends TestCase {

    public void testGenerateIndexContent() throws IOException {

            String title = "chase";
            String author = "cutshall";
            String expected = "<!DOCTYPE html>\n\n<html>\n\t<head>\n" +
                    "\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" author =\""+author+"\">\n" +
                    "\t\t<title>" + title + "</title>\n" +
                    "\t</head>\n\t<body>\n" +
                    "\t\t<p>\n\t\t\t<----Replace with something useful---->\n\t\t</p>\n" +
                    "\t</body>\n</html>";

            String actual = (new WebsiteGenerator()).generateIndexContent(title, author);

            assertTrue(expected.contentEquals(actual));
        }
    }
