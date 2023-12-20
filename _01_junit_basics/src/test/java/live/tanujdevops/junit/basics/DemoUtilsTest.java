package live.tanujdevops.junit.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoUtilsTest {

	@Test
	void testEqualsAndNotEquals() {
		DemoUtils demoUtils = new DemoUtils();
		assertEquals(10, demoUtils.add(6, 4), "6+4 must be 10");
		assertNotEquals(24, demoUtils.add(4, 6), "4 + 6 must not equl 24");
	}

}
