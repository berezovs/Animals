import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogTest {

	@Test
	public void test() {

		Frog t = new Frog();

		assertEquals("brown", t.getColor());

		assertEquals("", t.getName());

		Frog redFrog = new Frog("red");

		assertEquals("red", redFrog.getColor());

		Frog kermit = new Frog("green", "Kermit");

		assertEquals("green", kermit.getColor());

		assertEquals("Kermit", kermit.getName());

		assertEquals(0, kermit.getWartCount());

		assertEquals("move", kermit.getMoveStatement());

	}

}
