import java.util.Scanner;
class Fibo {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        
        getFiboSeries(num);
    }

    public static void getFiboSeries(int n){
        int a =0;
        int b=1;
        int sum =0;
         System.out.print(a +" ");
         System.out.print(b +" ");
         for(int i=2; i<=n; i++){
            sum = a+b;
            a=b;
            b=sum;
            System.out.print(sum +" ");
            
         }
 
        
        
       }
     
    }
