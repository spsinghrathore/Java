import java.util.*;
class count {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = obj.nextInt();
        System.out.print(getCount(num));
    }
    public static int getCount(int num) {
        int count =0;
        while (num !=0){
            count ++;
            num /= 10;
        }
        return count;
    }
}