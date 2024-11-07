import java.util.Scanner;
class Happy {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = obj.nextInt();

        boolean res = isHappy(num);                                   //calling happy method
        if(res) {
            System.out.println("This is a happy! number");
        }
        else {
             System.out.println("This is not happy! number");
        }
    }

    public static boolean isHappy(int num){
      int temp = num;
      int sum;
      do {
        sum = getSum(num);                              //getting sum of the square of  digits
        num =sum;                                     //assigning sum to number for further calling!
        if(sum==1) {
          return true;                        //if sum ==1 returning true
        }
        else {
          System.out.println("sum is : " + sum);             
        }
      } while(sum!=temp);                             
      
      return false;
    }

    public static int getSum(int num) {
      int l;
      int sum=0;                                                   

      while(num!=0){
         l = num%10;
        sum += l*l;
        num /= 10;

      }


      return sum;
    }
    
         
    }