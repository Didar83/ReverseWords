package learn.java.reversewords;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void test() {
		assertEquals("olleH !dlrow", ReverseWords.reverse("Hello world!"));
	}

}
