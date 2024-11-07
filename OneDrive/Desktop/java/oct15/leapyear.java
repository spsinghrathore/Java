//program for leap year!
import java.util.*;
class leapyear {
    public static void main(String[] args){
        //taking input
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a year :");
        int year = obj.nextInt();

        isLeapYear(year);
    }

    public static void isLeapYear(int year){
        if((year % 4 == 0 && year % 100 !=0) || year % 400 ==0){
            System.out.println("This is leap year");
        }
        else {
            System.out.println("not a leap year!");
        }
    }
}