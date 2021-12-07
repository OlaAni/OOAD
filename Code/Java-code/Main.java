public class Main {
    public static void main(String[] args) {

        
        System.out.println("ServiceAppointment");
        System.out.println("===================================================================");
        
        ServiceAppointment ServiceAppointment1 = new ServiceAppointment();
        ServiceAppointment1.setBooking(BookingType.REPAIR);
        ServiceAppointment1.setDate("11/11/2011");
        System.out.print(ServiceAppointment1);
        System.out.println("===================================================================");


        System.out.println("\nMechanic and Parts");
        System.out.println("\n===================================================================");
        
        Part part1 = new Part("Wheel", 5.00);
        Part part2 = new Part("Spoiler", 50.00);
        Mechanic mechanic1 = new Mechanic();
        mechanic1.setId("M550");
        
        System.out.println(part1 +" installed by "+ mechanic1.getId());
        System.out.println(part2 +" installed by "+ mechanic1.getId());

        
        System.out.println(Part.getTotalPartCost());
        System.out.println("===================================================================");

    }
}
