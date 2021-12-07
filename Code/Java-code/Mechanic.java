public class Mechanic extends Person{
    private String id;

    public Mechanic(String name, int phoneNumber)
    {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);

    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void viewCarDetails()
    {

    }

    @Override
    public String toString() {
        return "Mechanics name is "+ this.getName()+ " and phonenumber is "+ this.getPhoneNumber()+".";
    }
}