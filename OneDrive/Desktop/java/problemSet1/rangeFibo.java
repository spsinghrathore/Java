
import java.util.*;
class rangeFibo {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int num = obj.nextInt();

        getFibonacci(num);

    }

    public static void getFibonacci(int range){
        int a =0;
        int b=1;
        int temp =0;
        System.out.println("Fibonacci series in range " + range + "is : ");

        while(a<=range) {
            System.out.print(a + " ");
            temp =a+b;
            a=b;

            b=temp;
        }

    }

}