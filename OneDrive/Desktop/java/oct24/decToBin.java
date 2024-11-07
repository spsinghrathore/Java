import java.util.*;
class decToBin {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");
        int num = obj.nextInt();
        String res = decToBin(num);
        System.out.println(res);
    }
    public static String decToBin(int num) {
        String bin = " ";      //use to concatenate string
        do {
            int l = num%2;
            bin = l + bin;            //using to add numbers in the reverse order
            num /= 2;
        }while(num!=0);
        return bin;
    }
}