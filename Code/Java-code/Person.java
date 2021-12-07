abstract class Person {
	//public abstract void run();

	private String name;
	private JobType job;
	private int phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJob(JobType job) {
		this.job = job;
	}

	public JobType getJob() {
		return this.job;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}