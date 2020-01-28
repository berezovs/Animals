
public class Frog {
	private String color;
	private String name;

	Frog() {
		this("brown");
	}

	Frog(String color) {
		this(color, "");
	}

	Frog(String color, String name) {
		this.color = color;
		this.name = name;
	}

	public String getColor() {
		return this.color;
	}

	public String getName() {
		return this.name;
	}

}
