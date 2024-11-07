import java.util.Scanner;
class xylem {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = obj.nextInt();

        boolean res = isXylem(num);
        if(res) {
            System.out.println("This is a xylem number");
        }
        else {
             System.out.println("This is not xylem number");
        }
    }

    public static boolean isXylem(int num) {
        int dc = count.getCount(num); 
        
        int sum=0;
        int res = num % 10;
        num /=10;
        dc--;
        while(dc != 1) {
            int l = num%10;
            sum += l;
            num /= 10;
            dc--;
        }
        res += num;
       
        return (sum==res);       
    }



    
}