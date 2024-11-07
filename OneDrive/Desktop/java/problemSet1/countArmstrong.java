import java.util.*;
class countArmstrong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter staring range: ");
        int r1 = obj.nextInt();
        System.out.print("Enter staring range: ");
        int r2 = obj.nextInt();
        

        int count =0;
        for(int i= r1; i<=r2; i++){
            boolean res = isArmstrong(i);
                if(res) {
                    count++;
                    } 
        }
        System.out.print("There are " + count + " Armstrong number is present between");

      
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