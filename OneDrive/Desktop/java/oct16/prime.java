import  java.util.*;
class prime {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter a Range: ");
        int num = obj.nextInt();

//creating a loop from 1 to where user enter a number
 int primeCount=0;
        for(int v=2; v<=num; v++){
            boolean res = isPrime(v);
            if(res) {
                System.out.println(v);
                primeCount++;
            }
        }
        System.out.println("The prime number between 1-" +num + " is : " + primeCount);

         

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
