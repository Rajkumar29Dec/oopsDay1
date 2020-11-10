package altimetrik.raj;

public class VipCustomer {
    private String name;
    private String email;
    private long creditLimit;

    public VipCustomer() {
        this("Rajkumar","rk@gmail.com",34500L);
    }

    public VipCustomer(String name, long creditLimit) {
        this(name,"rk12@gmail.com",creditLimit);
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String n, String s, long l) {
        this.name=n;
        this.email=s;
        this.creditLimit=l;
        System.out.println(name+" "+email+" "+creditLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }
}
