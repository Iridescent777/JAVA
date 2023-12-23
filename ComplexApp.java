package T1;
import java.util.Scanner;
public class ComplexApp {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter complex number1 (real and imaginary part):");
        Complex num1 = new Complex(input.nextDouble(),input.nextDouble());
        System.out.println("Enter complex number2 (real and imaginary part):");
        Complex num2 = new Complex(input.nextDouble(),input.nextDouble());
        System.out.println("Number 1 is :"+"("+num1.toString()+")");
        if(num1.isReal()){
            System.out.println("("+num1.toString()+") is a pure real number");
        }
        else{
            System.out.println("("+num1.toString()+") is NOT a pure real number");
        }

        if(num1.isImaginary())
        {
            System.out.println("("+num1.toString()+") is a pure imaginary number");
        }
        else{
            System.out.println("("+num1.toString()+") is NOT a pure imaginary number");
        }
        System.out.println("Number 2 is :"+"("+num2.toString()+")");

        if(num2.isReal()){
            System.out.println("("+num1.toString()+") is a pure real number");
        }
        else{
            System.out.println("("+num1.toString()+") is NOT a pure real number");
        }

        if(num2.isImaginary())
        {
            System.out.println("("+num1.toString()+") is a pure imaginary number");
        }
        else{
            System.out.println("("+num1.toString()+") is NOT a pure imaginary number");
        }

        if(num1.equals(num2)){
            System.out.println(num1.toString()+" is equal to "+num2.toString());
        }
        else{
            System.out.println("("+num1.toString()+")"+" is NOT equal to "+"("+num2.toString()+")");
        }

        System.out.println("("+num1.toString()+")"+"+ ("+num2.toString()+") = "+"("+num1.add(num2).toString()+")");
    }
}
