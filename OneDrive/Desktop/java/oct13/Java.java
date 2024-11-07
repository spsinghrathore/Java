import java.util.*;
class Java {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("---Code Runs!---");
    //creating a scaaner class object
     
     System.out.print("Enter a number: ");
     int num = obj.nextInt();

     //calling prime function
     isPrime(num);

    }



    public static void isPrime(int num) {
        if(num == 1){
            System.out.println("This is a prime number");
        }
        int count=1;
        for(int i=2; i<num; i++){
            if(num%i==0){
                count++;
            }
        }

        if(count >= 2){
            System.out.println("Tnot a prime!");
        }
        else {
            System.out.println("This is a prime number");
        }
    }
}