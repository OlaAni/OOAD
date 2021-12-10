public class Mechanic extends Person{
    private String id;
    private JobType job;

    private ServiceAppointment[] serviceAppointments;

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

    public void setServiceAppointments(ServiceAppointment[] serviceAppointments) {
        this.serviceAppointments = serviceAppointments;
    }
    
    public String viewCarDetails()
    {
        String temp ="";
        for (ServiceAppointment serviceAppointment : serviceAppointments) {
            temp += serviceAppointment.getCar()+" // ";
            
        }
        return temp;
    }

    public String toString() {
        return this.getJob()+" name is "+ this.getName()+ " and phonenumber is "+ this.getPhoneNumber()+". ID number is "+ this.id + 
        "\n   "+ this.viewCarDetails();
    }
}