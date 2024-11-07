import java.util.*;
class nthFibo {
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
        System.out.print(n + "th fibonacci number is :");
 
         //instead of printing n we just print it after the loop exits only the last value of  a would be print
        while(n>1) {
            temp =a+b;
            a=b;
            b=temp;
            n--;
        }
         System.out.print(a);

    }

}