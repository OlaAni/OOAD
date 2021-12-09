import java.text.DecimalFormat;
public class Part {
    DecimalFormat df = new DecimalFormat("###,###.##");

    private String name;
    private double price;
    private int id;
    
    public static double totalPartCost = 0;

    private ServiceAppointment serviceAppointment;

    public Part(String part, double price, ServiceAppointment serviceAppointment)
    {
        this.name = part;
        this.price = price;
        this.serviceAppointment = serviceAppointment;

        totalPartCost += price;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getTotalPartCost() {
        return "Total part cost is = "+ totalPartCost;
    }

    public static void ResetTotalPartCost()
    {
        totalPartCost = 0;
    }

    @Override
    public String toString() {
        return this.name + " = " + df.format(this.price) + " for " + serviceAppointment.getCar().getRegistration();
    }
}
