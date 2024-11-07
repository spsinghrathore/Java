import  java.util.*;
class isPrime {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();

            boolean res = isPrime(num);
            if(res) {
                System.out.println("This is a prime number ");
               
            }
            else {
                System.out.println("This is not a prime number ");
               
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




