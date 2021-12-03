public class Main {


    public static void main(String[] args) {
        System.out.println("Mechanic and Parts");
        System.out.println("===================================================================");

        Part part1 = new Part("Wheel", 5.00);
        Part part2 = new Part("Wheel", 5.00);

        System.out.println(part1);


        System.out.println(Part.getTotalPartCost());
        System.out.println("===================================================================");

    }
    
}
