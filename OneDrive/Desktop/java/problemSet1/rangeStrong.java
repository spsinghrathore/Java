import java.util.Scanner;
class Strong {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a starting range : ");
        int r1 = obj.nextInt();

        System.out.println("Enter a ending range : ");
        int r2 = obj.nextInt();

        System.out.print("Armstrong number between " + r1 + " and " + r2 + " is ");
        for(int i= r1; i<=r2; i++) {
            boolean res = isStrong(i);
        if(res) {
            System.out.println(i);
        }
        }

    }

    public static boolean isStrong(int num) {
      int temp = num;
      int sum=0;
      
      while(num != 0) {
       int l = num%10;
      sum += getFact(l);
      num /= 10;
      }
      return (sum ==temp);
      

    }

    public static int getFact(int l){
        int fact=1;
        while(l!=1){
            fact *=l;
            l--;
        }
        return fact;
    }
}