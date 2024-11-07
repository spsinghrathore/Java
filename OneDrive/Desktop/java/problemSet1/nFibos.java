
import java.util.*;
class nFibos {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();

        getFibonacci(num);

    }

    public static void getFibonacci(int n){
        int a =0;
        int b=1;
        int temp =0;
        System.out.println( n + " Fibonacci numbers are ");

        while(n>0) {
            System.out.print(a + " ");
            temp =a+b;
            a=b;
            b=temp;
            n--;
        }

    }

}