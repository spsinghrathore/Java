import java.util.*;
class rangeArmstrong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter staring range: ");
        int r1 = obj.nextInt();
        System.out.print("Enter staring range: ");
        int r2 = obj.nextInt();
        System.out.print("Armstrong number between " + r1 + " and " + r2 + " is ");
        for(int i= r1; i<=r2; i++){
            boolean res = isArmstrong(i);
                if(res) {
                    System.out.print(i +" ");
                    } 
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