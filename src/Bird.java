
public class Bird extends Animal {

	Bird() {
		this("green");
	}

	Bird(String color) {
		this(color, "");
	}

	Bird(String color, String name) {
		super(color, name);
	}

	@Override
	public String getMoveStatement() {
		return "I fly when I go somewhere";
	}

}
