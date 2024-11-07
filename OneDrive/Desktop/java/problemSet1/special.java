//program for special two digit number
import java.util.*;
class special {
    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
     //taking input
     System.out.print("Enter a number:");
     int num = obj.nextInt();
    
     int sum=0, mul=1;
     int temp = num;
     if(num>9 && num<=99) {        //for two digit
         while (num!=0) {
            int l = num%10;
            sum += l;
            mul *= l;
            num/=10;
         }
        if(sum + mul == temp) {
            System.out.println("This is a special 2 digit number");
        }
        else {
            System.out.println("This is not a special 2 digit number");
        }
     }
     else {
        System.out.println("Enter a two digit number!");
        }
     }
     }
    
