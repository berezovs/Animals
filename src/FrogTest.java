import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogTest {

	@Test
	public void test() {
		Frog t = new Frog();

		Frog redFrog = new Frog("red");

		assertEquals("red", redFrog.getColor());
	}

}
