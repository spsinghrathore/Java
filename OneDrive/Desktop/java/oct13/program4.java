//program to check remaining days in a month
import java.util.*;

class program4 {
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter month num (1-12): ");
    int month = obj.nextInt();

    checkMonthDays(month);

  }

  public static void checkMonthDays(int month) {
    int[] allMonthsWith31 = {1,3,5,7,8,10,12};
    int[] allMonthsWith30 = {4,6,9,11};
    
    for(int i=0; i<7; i++){
        if(month == allMonthsWith31[i]){
           System.out.println("31 DAYS!");
           break;
        }
    }

     for(int i=0; i<4; i++){
        if(month == allMonthsWith30[i]){
           System.out.println("30 DAYS!");
           break;
        }
        
    }

    if(month == 2){
        System.out.print("This is a leap year or not (y/n)");
        Scanner obj = new Scanner(System.in);
        String isLeap = obj.next();
        if(isLeap == "y") {
          System.out.println("29 DAYS!");
        }
        else {
          System.out.println("28 DAYS!");
        }
        
      
    }
    System.out.println("method end succes!");
    
  }
}