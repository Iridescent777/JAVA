import java.util.Scanner;
public class LuhnVerification {

    private long code = 0;

    // iput the code
    public boolean readCode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a 13-16 digit card number");
        String number = new String(input.next());

        // judge the validity of the number
        boolean isValid = false;
        while(isValid == false)
        {
            isValid = true;
            for(int i =0;i<number.length();i++){
                if(!Character.isDigit(number.charAt(i))){
                    System.out.println("The code is invalid, please input again");
                    number = new String(input.next());
                    isValid = false;
                    break;
                }
                if(number.length()>16 || number.length()<13){
                    System.out.println("The code is invalid, please input again");
                    number = new String(input.next());
                    isValid = false;
                }
            }

        }
        this.code = Long.parseLong(number);
        return isValid;
    }

    // get the code
    public long getCode()
    {
        System.out.println(code);
        return this.code;
    }

   // judge the validity of the code
    public void judgeValidity(){

        double sum1 = 0;
        double sum2 = 0;


        double num[] = new double[16];
        for(int i = 0;i<16;i++){
            long a =0;
            long b =0;
            a = (long)(code/Math.pow(10,i));
            b = a%10;
            num[i] = b;
        }
        for(int i = 0;i<16;i+=2){
            sum1 += num[i];
        }
        for(int i =1;i<16;i+=2){
            if(num[i]*2>9.0){
                double p =0;
                p=num[i]*2%10;

                num[i] = p+1.0;
            }
            else
            {
                num[i] = num[i] *2.0;
            }
            sum2 += num[i];
        }
        if((sum1+sum2)%10==0)
        {
            System.out.println("The code is correct");

        }
        else{
            System.out.println("The code is incorrect");
        }
    }



    public static void main(String[] args) {
        LuhnVerification card = new LuhnVerification();
        card.readCode();
        System.out.println("The machine is now verifying your code...");
        // add a delay effect
        try {
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        card.judgeValidity();
    }
}
