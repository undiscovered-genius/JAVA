public class ComplexNumber {
    // write your code here
    private double real, imaginary;
    
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public double getReal(){
        return real;
    }
    
    public double getImaginary(){
        return imaginary;
    }
    
    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }
    
    public void add(ComplexNumber complex){
        this.real = this.real + complex.getReal();
        this.imaginary = this.imaginary + complex.getImaginary();
    }
    
     public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }
    
    public void subtract(ComplexNumber complex){
        this.real = this.real - complex.getReal();
        this.imaginary = this.imaginary - complex.getImaginary();
    }
}