package T1;

public class Complex {

    private double real = 0.0;
    private double imag = 0.0;

    private final static double EPSILON = 1e-8;

    public Complex(){

    }

    public Complex(double real,double imag) {
        if(Double.isNaN(real) || Double.isNaN(imag)){
            System.out.println("You can not type in NaN");
        }

        else{
            this.real = real;
            this.imag = imag;
        }
    }

    public double getReal(){
        return this.real;
    }
    public void setReal(double real){
        this.real = real;
    }

    public double getImag(){
        return this.imag;
    }

    public void setImag(double imag){
        this.imag = imag;
    }

    public void setValue(double real,double imag){
        this.real = real;
        this.imag = imag;
    }

    public String toString(){
        String print =String.format("%f+%fi",this.real,this.imag);
        return print;
    }

    public boolean isReal(){
        if(this.imag == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isImaginary(){
        if(isReal() == false && this.real == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(double real,double imag){
        if((real-this.real)*(real-this.real)<EPSILON*EPSILON && (imag-this.imag)*(imag-this.imag)<EPSILON*EPSILON){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(Complex another){
        return equals(another.real,another.imag);
    }

    public double abs()
    {
        return Math.sqrt(this.real*this.real+this.imag*this.imag);
    }

    public Complex add(Complex right){
        return new Complex(right.real+this.real,right.imag+this.imag);
    }

    public Complex subtract(Complex right){
        return new Complex(this.real-right.real,this.imag-right.imag);
    }

    public Complex multiply(Complex right){
        return new Complex(this.real*right.real-this.imag*right.imag,this.real*right.imag+this.imag*right.real);
    }

    public Complex divide(Complex right){
        return new Complex((this.real*right.real+this.imag*right.imag)/(right.real*right.real+right.imag*right.imag),(-this.real*right.imag+this.imag*right.real)/(right.real*right.real+right.imag*right.imag));

    }
}
