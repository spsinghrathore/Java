//program to print sum of first n natural number
import java.util.*;
class natural {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number :");

        int num = obj.nextInt();

        sumOfNatural(num);
    }

    public static void sumOfNatural(int num) {
        int sum=1;
          for (int i=2; i<=num; i++) {
            sum += i;
          }
        System.out.println("Sum of first " + num + "natural number is : " + sum);
    }
}
