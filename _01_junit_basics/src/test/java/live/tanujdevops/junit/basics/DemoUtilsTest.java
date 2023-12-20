package live.tanujdevops.junit.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoUtilsTest {

	@Test
	void testEqualsAndNotEquals() {
		DemoUtils demoUtils = new DemoUtils();
		int expected = 10;
		int actual = demoUtils.add(6, 4);
		assertEquals(expected, actual, "6+4 must be 10");
	}

}
