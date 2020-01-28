import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BirdTest {

	@Test
	public void test() {
		Bird b = new Bird();

		assertEquals("green", b.getColor());

		Bird cardinal = new Bird("red");

		assertEquals("red", cardinal.getColor());

		Bird bigBird = new Bird("yellow", "Big Bird");

		assertEquals("yellow", bigBird.getColor());

		assertEquals("Big Bird", bigBird.getName());
	}

}
