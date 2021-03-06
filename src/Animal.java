
public abstract class Animal {
	private String color, name;

	public Animal(String color, String name) {
		this.color = color;
		this.name = name;
	}

	public String getColor() {
		return this.color;
	}

	public String getName() {
		return this.name;
	}

	abstract public String getMoveStatement();
}
