public class Main {
    public static void main(String[] args) {

        System.out.println("\n======================<--Car Object-->=========================================");

        Car car1 = new Car();
        car1.setMake("Bently");
        car1.setRegistration("ABCO12");
        car1.setYear(2001);

        Car car2 = new Car();
        car2.setMake("VolkSawagen");
        car2.setRegistration("GM123");
        car2.setYear(1990);

        System.out.println("\n======================<--Customer Object-->=========================================");
        Customer customer1 = new Customer();
        customer1.setName("Jim Doe");

        Customer customer2 = new Customer();
        customer2.setName("Jake Doe");

        
        System.out.println("\n======================<--ServiceAppointment Object-->=========================================");
        
        ServiceAppointment serviceAppointment1 = new ServiceAppointment();
        serviceAppointment1.setStatus(CarStatusType.QUEUED);;
        serviceAppointment1.setCustomer(customer1);
        serviceAppointment1.setCar(car1);
        serviceAppointment1.setBooking(BookingType.REPAIR);
        serviceAppointment1.setDate("11/11/2011");
        System.out.println(serviceAppointment1);

        ServiceAppointment serviceAppointment2 = new ServiceAppointment();
        serviceAppointment2.setStatus(CarStatusType.QUEUED);
        serviceAppointment2.setCustomer(customer2);
        serviceAppointment2.setCar(car2);
        serviceAppointment2.setBooking(BookingType.MODIFICATION);
        serviceAppointment2.setDate("11/12/2021");
        System.out.println(serviceAppointment2);

        System.out.println("\n======================<--Mechanic + HeadMechanic Object-->=========================================");

        Mechanic mechanic1 = new Mechanic("John Doe",353892324, JobType.MECHANIC);
        HeadMechanic headMechanic = new HeadMechanic("Jane Doe",324532523, JobType.HEAD_MECHANIC);
        headMechanic.setId("HM11");
        mechanic1.setId("M550");

        mechanic1.setServiceAppointment(serviceAppointment1);
        headMechanic.setServiceAppointment(serviceAppointment2);

        System.out.println(mechanic1);
        System.out.println(headMechanic+"\n");

        System.out.println(mechanic1.viewCarDetails());
        System.out.println(headMechanic.viewCarDetails());

        System.out.println("\n======================<--Part Object-->=========================================");

        
        Part part1 = new Part("Wheel", 5.00, serviceAppointment1);
        Part part2 = new Part("Spoiler", 50.00,serviceAppointment1);


        System.out.println(part1 +" installed by "+ mechanic1.getId());
        System.out.println(part2 +" installed by "+ headMechanic.getId());

        
        System.out.println(Part.getTotalPartCost());
        Part.ResetTotalPartCost();

        
        Part part3 = new Part("Window", 15.00,serviceAppointment2);
        Part part4 = new Part("Exhaust", 100.00,serviceAppointment2);


        System.out.println(part3 +" installed by "+ mechanic1.getId());
        System.out.println(part4 +" installed by "+ mechanic1.getId());

        
        System.out.println(Part.getTotalPartCost());
        Part.ResetTotalPartCost();

        serviceAppointment1.setStatus(CarStatusType.REPAIR_COMPLETE);;
        serviceAppointment2.cancelAppointment();


    }
}
