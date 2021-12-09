public class Mechanic extends Person{
    private String id;
    private JobType job;

    private ServiceAppointment serviceAppointment;

    public Mechanic(String name, int phoneNumber, JobType job)
    {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.job = job;
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
	public void setJob(JobType job) {
		this.job = job;
	}

	public JobType getJob() {
		return this.job;
	}


    public void setserviceAppointment(ServiceAppointment serviceAppointment)
    {
        this.serviceAppointment = serviceAppointment;

    }
    
    public String viewCarDetails()
    {
        return "Car Details\nReg:" +serviceAppointment.getCar().getRegistration()+" Year: "+ serviceAppointment.getCar().getYear();
    }

    public String toString() {
        return this.getJob()+" name is "+ this.getName()+ " and phonenumber is "+ this.getPhoneNumber()+". ID number is "+ this.id;
    }
}