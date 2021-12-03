public class Part {

    private String part;
    private double price;
    private int id;
    public static double totalPartCost = 0;

    public Part(String part, double price)
    {
        this.part = part;
        this.price = price;

        totalPartCost += price;
    }

    public String getPart() {
        return this.part;
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

    public void setPart(String part) {
        this.part = part;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getTotalPartCost() {
        return "Total part cost is = "+ totalPartCost;
    }
}
