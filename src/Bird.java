
public class Bird {
	private String color, name;

	Bird() {
		this("green");
	}

	Bird(String color) {
		this(color, "");
	}

	Bird(String color, String name) {
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
