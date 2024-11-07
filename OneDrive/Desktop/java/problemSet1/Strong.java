import java.util.Scanner;
class Strong {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = obj.nextInt();

        boolean res = isStrong(num);
        if(res) {
            System.out.println("This is a strong number");
        }
        else {
             System.out.println("This is not strong number");
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