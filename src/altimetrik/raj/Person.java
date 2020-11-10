package altimetrik.raj;

public class Person {
    private String firstName,lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public void setFirstName(String FirstName){
        this.firstName=FirstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age>0 && age<100)
        this.age = age;
        else
            this.age=0;
    }
    public boolean isTeen(){
        if (age>12 && age<20)
            return true;
        else
            return false;
    }
    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty())
            return firstName;
        else if (firstName.isEmpty())
            return lastName;
        else if (lastName.isEmpty())
            return firstName;
        else
            return firstName+" "+lastName;
    }

}
