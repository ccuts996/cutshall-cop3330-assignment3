package ex45;

import junit.framework.TestCase;

public class WordReplacerTest extends TestCase {

	public void testReplace() {
		String input = """
				chase is the best """;

		String expected = """
				chase is the worst""";

		String actual = WordReplacer.replace(input, "best", "worst");

		assertEquals(expected, actual);
	}
}