import java.util.*;
class power {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = obj.nextInt();
        System.out.print("enter a power:");
        int pow = obj.nextInt();
        System.out.print(getPow(num,pow));
    }
    public static int getPow(int base, int pow) {
        int res=1;
        while(pow !=0){
            res *=base;
            pow--;
        }
        return res;
    }
}