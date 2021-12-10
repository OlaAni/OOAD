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


        Car car3 = new Car();
        car3.setMake("Porsche");
        car3.setRegistration("EF22");
        car3.setYear(2015);

        System.out.println("\n======================<--Customer Object-->=========================================");
        Customer customer1 = new Customer();
        customer1.setName("Jim Doe");

        Customer customer2 = new Customer();
        customer2.setName("Jake Doe");

        Customer customer3 = new Customer();
        customer3.setName("Jade Doe");

        
        System.out.println("\n======================<--ServiceAppointment Object-->=========================================");
        ServiceAppointment[] serviceAppointments1 = new ServiceAppointment[2];
        ServiceAppointment[] serviceAppointments2 = new ServiceAppointment[1];

        
        serviceAppointments1[0] = new ServiceAppointment();
        serviceAppointments1[0].setStatus(CarStatusType.QUEUED);;
        serviceAppointments1[0].setCustomer(customer1);
        serviceAppointments1[0].setCar(car1);
        serviceAppointments1[0].setBooking(BookingType.REPAIR);
        serviceAppointments1[0].setDate("11/11/2011");
        System.out.println(serviceAppointments1[0]);

        serviceAppointments1[1] = new ServiceAppointment();
        serviceAppointments1[1].setStatus(CarStatusType.QUEUED);
        serviceAppointments1[1].setCustomer(customer2);
        serviceAppointments1[1].setCar(car2);
        serviceAppointments1[1].setBooking(BookingType.MODIFICATION);
        serviceAppointments1[1].setDate("11/12/2021");
        System.out.println(serviceAppointments1[1]);


        serviceAppointments2[0] = new ServiceAppointment();
        serviceAppointments2[0].setStatus(CarStatusType.QUEUED);;
        serviceAppointments2[0].setCustomer(customer3);
        serviceAppointments2[0].setCar(car3);
        serviceAppointments2[0].setBooking(BookingType.INSPECTION);
        serviceAppointments2[0].setDate("11/11/2015");
        System.out.println(serviceAppointments2[0]);

        System.out.println("\n======================<--Mechanic + HeadMechanic Object-->=========================================");

        Mechanic mechanic1 = new Mechanic("John Doe",353892324, JobType.MECHANIC);
        HeadMechanic headMechanic = new HeadMechanic("Jane Doe",324532523, JobType.HEAD_MECHANIC);
        headMechanic.setId("HM11");
        mechanic1.setId("M550");

        mechanic1.setServiceAppointments(serviceAppointments1);
        headMechanic.setServiceAppointments(serviceAppointments2);

        System.out.println(mechanic1);
        System.out.println(headMechanic+"\n");


        System.out.println("\n======================<--Part Object-->=========================================");

        
        Part part1 = new Part("Wheel", 5.00, serviceAppointments1[0]);
        Part part2 = new Part("Spoiler", 50.00,serviceAppointments1[0]);


        System.out.println(part1 +" installed by "+ mechanic1.getId());
        System.out.println(part2 +" installed by "+ headMechanic.getId());

        
        System.out.println("Total part cost is = "+ Part.getTotalPartCost());
        Part.ResetTotalPartCost();

        
        Part part3 = new Part("Window", 15.00,serviceAppointments1[1]);
        Part part4 = new Part("Exhaust", 100.00,serviceAppointments1[1]);




        System.out.println(part3 +" installed by "+ mechanic1.getId());
        System.out.println(part4 +" installed by "+ mechanic1.getId());

        
        System.out.println("Total part cost is = "+ Part.getTotalPartCost());
        Part.ResetTotalPartCost();



        serviceAppointments1[0].setStatus(CarStatusType.REPAIR_COMPLETE);
        serviceAppointments1[1].cancelAppointment();
        serviceAppointments2[0].setStatus(CarStatusType.QUEUED);



    }
}
