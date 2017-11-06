package snail;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SnailTest {
	int row = 6;
	int col = 6;
	String newLine = System.getProperty("line.separator");

	@Test
	public void test() {
		Snail snail = new Snail();
		assertEquals(
				"0 1 2 3 4 5" + newLine + "19 20 21 22 23 6" + newLine + "18 31 32  33 24 7" + newLine
						+ "17 30 35  34 25 8" + newLine + "16 29 28 27 26 9" + newLine + "15 14 13 12 11 10",
				snail.show(row, col));
	}

}
