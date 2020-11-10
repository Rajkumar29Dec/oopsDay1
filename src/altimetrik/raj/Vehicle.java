package altimetrik.raj;

public class Vehicle {
    private String model;
    private String vehicle_type;
    private int speedperkm;
    private int seats;
    private int gear_count;

    public void handle_Steerimg(){
        System.out.println("Handle steering is on Left hand side of the car");
    }
    public void changingGears(){
        System.out.println("Gear Number"+gear_count);
    }
    public void speed(){
        System.out.println("Speed"+speedperkm);
    }
}
