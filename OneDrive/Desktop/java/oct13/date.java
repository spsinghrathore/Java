//program to check a date is valid or not DD-MM-YYY
import java.util.*;

class date {

    public static void main(String[] args){

    Scanner obj = new Scanner(System.in);

    //taking input from user
    System.out.println("Enter a Date (DD-MM-YYY): ");
    String date = obj.nextLine();


    //spliting the string!
    String[] dateArray = date.split("-");
    
    //converting into numbers!
    int days = Integer.valueOf(dateArray[0]);
    int months = Integer.valueOf(dateArray[1]);
    int year = Integer.valueOf(dateArray[2]);

    //checking the months 
    if(months < 1 || months > 12) {
        System.out.print("Invalid Month!");
    }
   
    //checking year
    if(year < 0) {
        System.out.println("Invalid year");
    }
    
    //checking days and setting max days ->
    int maxDays = getMaxDays(months, year);

    if(days< 1 || days > maxDays ){
        System.out.println("Invalid days!");
    }
    else {
        System.out.println("Date is valid!");
    }
    //--------------------------------------main ends!

    }

    //method to get maximum number of days 
    public static int getMaxDays(int month,int year) {
        if(month == 04 || month == 06 || month == 9 || month == 12 ){
            return 30;
        }

       //---------------------------february
        else if(month == 2){
            //checking leap year--->
                
            if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {   
             return 29;}

            else { return 28; }
                    
            
        }
        
        else { return 30; }
            
        
    }
}
    