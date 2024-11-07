import java.util.*;
class count {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number");
        int num = obj.nextInt();
        int res = getCount(num);

        System.out.print(res);

    }
    public static int getCount(int num){
        int count=0;
        for (int i=num; i!=0; i/=10){
           
            count++;
        }
        return count;
    }
}