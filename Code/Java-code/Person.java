abstract class Person {
	public abstract void run();

	private String name;
	private JobType job;
	private int phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}