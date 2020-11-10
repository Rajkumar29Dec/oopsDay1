package altimetrik.raj;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());


            //Person Class

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


//        Account_challenge_in_class

        Account_Challenge_in_Class account_challenge_in_class=new Account_Challenge_in_Class();
        account_challenge_in_class.setName("Raj kumar");
        account_challenge_in_class.setEmail("rajkumar.innocube@gmail.com");
        account_challenge_in_class.setPhoneNumber(938414017);
        account_challenge_in_class.setAccountNumber(1222045285);
        account_challenge_in_class.setBalance(8000);
        System.out.println(account_challenge_in_class.getName());
        System.out.println(account_challenge_in_class.getEmail());
        System.out.println(account_challenge_in_class.getPhoneNumber());
        System.out.println(account_challenge_in_class.getAccountNumber());
        System.out.println(account_challenge_in_class.getBalance());
        account_challenge_in_class.withdraw(8000);
        account_challenge_in_class.deposit(2000);
        account_challenge_in_class.withdraw(8000);



//        vip cus5omer

        VipCustomer vc=new VipCustomer();
        VipCustomer vc1=new VipCustomer("raj",250000);
        vc.setName("raj");
        vc.setEmail("rkm@gmail.com");
        vc.setCreditLimit(45000);
        System.out.println(vc.getName()+" "+vc.getEmail()+" "
        + vc.getCreditLimit());


//        Wall area

        WallArea wall = new WallArea(4,5);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());


//        Point

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


//        carpet cost calculator


        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator1 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator1.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator1 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator1.getTotalCost());



//        ComplexNumber


        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }
}
