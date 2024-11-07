import java.util.*;
class isArmstrong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = obj.nextInt();
      boolean res = isArmstrong(num);
      if(res) {
        System.out.println("this is a armstrong number");
      }
      else {
        System.out.println("this is not a armstrong number");
      }
    }
    public static boolean isArmstrong(int num) {
        int temp = num;
       int pow = count.getCount(num);
       int sum =0;
        while(num!=0) {
            int l = num%10;
            sum+= power.getPow(l,pow);
            num /=10;
        }
        return (sum==temp);
    }
}