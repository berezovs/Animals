import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void test() {
		Animal a = new Bird();
		assertEquals("green", a.getColor());

		a = new Frog();
		assertEquals("brown", a.getColor());

		assertEquals(0, ((Frog) a).getWartCount());

	}

}
