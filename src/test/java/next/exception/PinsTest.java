package next.exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class PinsTest {

	@Test
	public void Pin인스턴스_생성() {
		Pins pin = Pins.lost(5);
		assertEquals(pin, Pins.lost(5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void pin인스턴스_생성_오류_case1() throws Exception {
		Pins pin = Pins.lost(-1);
		assertEquals(pin, Pins.lost(-1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void pin인스턴스_생성_오류_case2() throws Exception {
		Pins pin = Pins.lost(11);
		assertEquals(pin, Pins.lost(11));
	}

}
