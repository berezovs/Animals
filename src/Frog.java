
public class Frog extends Animal {
	private int wartCount;

	Frog() {
		this("brown");
	}

	Frog(String color) {
		this(color, "");
	}

	Frog(String color, String name) {
		super(color, name);
		this.wartCount = 0;

	}

	public int getWartCount() {
		return wartCount;
	}

}
