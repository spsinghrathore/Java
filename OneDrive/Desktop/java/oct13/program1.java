//program to print user enter a number or a digit
import java.util.*;
class program1 {
    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
     //taking input
     System.out.print("Enter a number or a digit: ");
     int num = obj.nextInt();
    
     isDigit(num);
    }

    public static void isDigit(int num){
        if(num>=-9 && num<=9){
            System.out.println("Digit");
        }
        else {
            System.out.println("Number");
        }
    }
}