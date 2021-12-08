public class Main {
    public static void main(String[] args) {

        Mechanic mechanic1 = new Mechanic("John Doe",353892324);
        HeadMechanic headMechanic = new HeadMechanic("Jane Doe",324532523);

        headMechanic.setId("HM11");
        mechanic1.setId("M550");
        System.out.println(mechanic1);
        System.out.println(headMechanic);

        
        System.out.println("===================================================================");
        
        ServiceAppointment ServiceAppointment1 = new ServiceAppointment();
        ServiceAppointment1.setBooking(BookingType.REPAIR);
        ServiceAppointment1.setDate("11/11/2011");
        System.out.print(ServiceAppointment1);
        System.out.println("\n===================================================================");

        Car car1 = new Car();
        car1.setMake("Bently");
        car1.setRegistration("ABCO12");
        car1.setYear(2001);

        Car car2 = new Car();
        car2.setMake("VolkSawagen");
        car2.setRegistration("GM123");
        car2.setYear(1990);

        System.out.println("\n===================================================================");
        
        Part part1 = new Part("Wheel", 5.00);
        Part part2 = new Part("Spoiler", 50.00);


        System.out.println(part1 +" installed by "+ mechanic1.getId() + " in "+ car1.getRegistration());
        System.out.println(part2 +" installed by "+ headMechanic.getId() + " in " + car1.getRegistration());

        
        System.out.println(Part.getTotalPartCost());
        Part.ResetTotalPartCost();
        System.out.println("===================================================================");



        Part part3 = new Part("Window", 15.00);
        Part part4 = new Part("Exhaust", 100.00);


        System.out.println(part3 +" installed by "+ mechanic1.getId() + " in "+ car2.getRegistration());
        System.out.println(part4 +" installed by "+ mechanic1.getId() + " in " + car2.getRegistration());

        
        System.out.println(Part.getTotalPartCost());
        Part.ResetTotalPartCost();


    }
}
