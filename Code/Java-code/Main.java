public class Main {
    public static void main(String[] args) {
        
        ServiceAppointment ServiceAppointment1 = new ServiceAppointment();
        ServiceAppointment1.setBooking(BookingType.REPAIR);
        ServiceAppointment1.setDate("11/11/2011");
        System.out.print(ServiceAppointment1);
    }
}
