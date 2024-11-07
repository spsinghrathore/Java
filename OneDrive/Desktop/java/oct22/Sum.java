import java.util.*;
class Sum {


public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
   while(1==1){
        System.out.println("Enter a number: ");
        int num = obj.nextInt();
      int l;
      int sum=0;

      while(num!=0){
         l = num%10;
        sum += l*l;
        num /= 10;

      }


      System.out.print(sum);
      

      }
    }
}