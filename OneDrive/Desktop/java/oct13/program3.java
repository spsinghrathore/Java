//program to check user enter two digit number or not 
import java.util.*;
class program3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = obj.nextInt();

        isTwoDigit(num);
    }

    public static void isTwoDigit(int num){
        if(num >9 && num <=99 || num < -9 && num >= -99){
            System.out.println("2 Two DIGIT NUMBER");

        }

        else {
            System.out.println("not a two digit number");
        }
    }
}