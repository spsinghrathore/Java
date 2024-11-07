import java.util.Scanner;
class disarium {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = obj.nextInt();
        boolean  res = isDisarium(num);
        if(res) {
            System.out.println("This is a diasrium number!");
        }
        else {
            System.out.println("This is not a diasrium number!");
        }

    }

    public static boolean isDisarium(int num) {
        int temp = num;
        int sum =0;
        int dc = getDigit(num);
        while(num!=0){
            int l = num%10;
            sum += getPower(l,dc);
            dc--;
            num /= 10;

        }
        return (temp == sum);
    }

    public static int getDigit(int num){
        int count=0;
        while(num!=0){
            count++;
            num /=10;
        }
        return count;
    }
    public static int getPower(int num, int pow){
        int res = 1;
        while(pow!=0){
            res *=num;
            pow--;
        }
        return res;
    }
}