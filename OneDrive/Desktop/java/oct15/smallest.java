import java.util.*;
class smallest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = obj.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = obj.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = obj.nextInt();

        findSmallest(a,b,c);
    }

    public static void findSmallest(int a, int b, int c){
       int result = (a<b && a<c) ? a : (b<c) ? b:c;
       System.out.println("smallest number is : " + result);324
    }
}