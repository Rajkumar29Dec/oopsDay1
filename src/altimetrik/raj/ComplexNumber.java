package altimetrik.raj;

public class ComplexNumber {

    private double real,imaginary;

    public ComplexNumber(double v, double v1) {
        this.real=v;
        this.imaginary=v1;
    }


    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(ComplexNumber complexNumber){
         this.real=(complexNumber.getReal()+ this.real);
         this.imaginary=(complexNumber.getImaginary()+this.imaginary);
    }
    public void add(double real,double imaginary){
        this.real= (real+this.real);
        this.imaginary=(imaginary+this.imaginary);
    }public void subtract(ComplexNumber complexNumber){
        this.real=(complexNumber.getReal()- this.real);
        this.imaginary=(complexNumber.getImaginary()+this.imaginary);
    }
    public void subtract(double real,double imaginary){
        this.real=(real-this.real);
        this.imaginary=(imaginary-this.imaginary);
    }


}
