public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private  String email;

    public VipCustomer(){
       this("Default name", 50000.00, "default@email.com");
    }
    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "unknoww@email.com");
    }

    public VipCustomer(String customerName, double creditLimit, String email) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
