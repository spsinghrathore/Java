import  java.util.*;
class rangePrime {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter a Range: ");
        int r1 = obj.nextInt();

        System.out.print("Enter a ending Range: ");
        int r2 = obj.nextInt();

        System.out.println("Prime numbers between " + r1 + " and " + r2 + " is: ");


 int primeCount=0;
        for(int v=r1; v<=r2; v++){
            boolean res = isPrime(v);
            if(res) {
                System.out.println(v);
                primeCount++;
            }
        }

         

    }
    public static boolean isPrime(int num) {
        int count =1;
        for(int i=2; i<num; i++){
            if(num%i == 0){
                count++;
            }

        }
        if(count == 1) {
            return true;
        }
        else {
            return false;
        }
    }


}
