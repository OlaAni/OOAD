public class HeadMechanic extends Mechanic{

	public static double sales = 0;


	public HeadMechanic(String name, int phoneNumber) {
		super(name, phoneNumber);
	}


	public static String viewSales() {
		return "The sales for this month are = " + sales;
	}

    public String toString() {
        return "Mechanics name is "+ this.getName()+ " and phonenumber is "+ this.getPhoneNumber()+". ID nuber is "+ this.getId();
    }
}