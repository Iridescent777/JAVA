public class DateUtil {

    // judge whether the year is a leap year
    static boolean isLeapYear(int year) {
        boolean Lp = false;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            Lp = true;
        }
        return Lp;
    }


    // judge validity of the date
    static boolean isValidDate(int year, int month, int day) {
        boolean Vd = false;
        // scope of the year and the month
        if (year > -0 && year < 9999 && month > 0 && month < 13) {
            // In the Leap year
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (0 < day && day < 32) {
                        Vd = true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (0 < day && day < 31) {
                        Vd = true;
                    }
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        if (0 < day && day < 30) {
                            Vd = true;
                        }
                    } else {
                        if (0 < day && day < 29) {
                            Vd = true;
                        }

                    }
                    break;
            }
        }
        return Vd;
    }


    static int getDayOfWeek(int year, int month, int day) {
        int digit = -1;
        if (isValidDate(year, month, day)) {
            digit = year %100;
            int num1 = 0; // num1 can be 4,2,0,6
            int century_number = (year / 100) % 4;

            //Step 1
            switch (century_number) {
                case 1:
                    num1 = 4;
                    break;
                case 2:
                    num1 = 2;
                    break;
                case 3:
                    num1 = 0;
                    break;
                case 0:
                    num1 = 6;
                    break;
            }

            //Step 2
            digit += num1;
            //Step 3
            digit += (int) (year % 100 / 4);
            //Step 4
            switch (month) {
                case 3:
                case 11:
                    digit += 3;
                    break;
                case 4:
                case 7:
                    digit += 6;
                    break;
                case 5:
                    digit += 1;
                    break;
                case 6:
                    digit += 4;
                    break;
                case 8:
                    digit += 2;
                    break;
                case 9:
                case 12:
                    digit += 5;
                    break;
                case 1:
                    if (isLeapYear(year)) {
                        digit += 6;
                    }
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        digit += 2;
                    } else {
                        digit += 3;
                    }
                    break;

            }
            //Step 5
            digit += day;
            return digit % 7;
        }
        else {
            System.out.println("The date does not exist");
        }
        return digit % 7;
    }


   static void printCalendar(int year,int month){
        int Day_Max = 0;
        int value = 0;
        System.out.println(" MON TUE WED THU FRI SAT SUN");
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                Day_Max = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Day_Max = 30;
                break;
            case 2:
                if(isLeapYear(year)){
                    Day_Max = 29;
                }
                else{
                    Day_Max = 28;
                }
                break;
        }
        value = getDayOfWeek(year,month,1);
        if(value == 0){
            value = 7;
        }
        for(int i=1;i<value;i++){
            if(value == 1)
            {
                break;
            }
            System.out.print("    ");
        }
        for(int i = 1;i<Day_Max+1;i++){
            System.out.printf("%4d",i);
            if(getDayOfWeek(year,month,i) == 0)
            {
                System.out.printf("\n");
            }
        }
   }


   static void printCalendar(int year) {
       for (int i = 1; i < 13; i++) {
           System.out.printf("\t\t\tMonth%d\n",i);
           printCalendar(year, i);
           System.out.printf("\n");
       }
   }

   static String formatDate(int year,int month,int day){
        String M = new String();
        String outcome = new String();
        switch(month){
            case 1:
                M=" Jan ";
                break;
            case 2:
                M=" Feb ";
                break;
            case 3:
                M=" Mar ";
                break;
            case 4:
                M=" Apr ";
                break;
            case 5:
                M=" May ";
                break;
            case 6:
                M=" Jun ";
                break;
            case 7:
                M=" Jul ";
                break;
            case 8:
                M=" Aug ";
                break;
            case 9:
                M=" Sep ";
                break;
            case 10:
                M=" Oct ";
                break;
            case 11:
                M=" Nov ";
                break;
            case 12:
                M=" Dec ";
                break;
        }

        switch(getDayOfWeek(year,month,day)){
            case 0:
                outcome = "Sunday "+day+M+year;
                break;
            case 1:
                outcome = "Monday "+day+M+year;
                break;
            case 2:
                outcome = "Tuesday "+day+M+year;
                break;
            case 3:
                outcome = "Wednesday "+day+M+year;
                break;
            case 4:
                outcome = "Thursday "+day+M+year;
                break;
            case 5:
                outcome = "Friday "+day+M+year;
                break;
            case 6:
                outcome = "Saturday "+day+M+year;
                break;
        }
        return outcome;
   }

    public static void main(String[] args) {

    }
}
