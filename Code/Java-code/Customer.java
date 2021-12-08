import java.time.YearMonth;

public class Customer extends Person{
    
    private String email;
    private int phoneNumber;
    private String address;
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }  

    @Override
    public String toString() {
        return this.getName();
    }
}
