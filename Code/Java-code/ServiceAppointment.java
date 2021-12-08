public class ServiceAppointment{
    
    private String date;
    private String time;
    private BookingType booking;
    private PaymentRecievedType paid;
    private boolean destroy;
    private double cost;
    private CarStatusType status;

    private Car car;
    private Customer customer;
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public BookingType getBooking() {
        return booking;
    }
    
    public void setBooking(BookingType booking) {
        this.booking = booking;
    }
    
    public PaymentRecievedType getPaid() {
        return paid;
    }
    
    public void setPaid(PaymentRecievedType paid) {
        this.paid = paid;
    }
    
    public boolean isDestroy() {
        return destroy;
    }
    
    public void setDestroy(boolean destroy) {
        this.destroy = destroy;
    }
    
    public double getCost() {
        return cost;
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public CarStatusType getStatus() {
        return status;
    }
    
    public void setStatus(CarStatusType status) {
        this.status = status;
    }

    public void cancelAppointment(){
    }

    
    public void setCar(Car car)
    {
        this.car = car;

    }

        
    public void setCustomer(Customer customer)
    {
        this.customer = customer;

    }

    public String toString(){
        return "Appointment date: " + date + " Booking type: " + booking + " with "+this.car +" for "+ this.customer;
    }
}