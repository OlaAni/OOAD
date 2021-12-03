public class Main {


    public static void main(String[] args) {
        Part part1 = new Part("Wheel", 5.00);
        Part part2 = new Part("Wheel", 5.00);

        Mechanic mechanic1 = new Mechanic();
        mechanic1.setId("B550");

        System.out.println(part2.getTotalPartCost());


    }
    
}
