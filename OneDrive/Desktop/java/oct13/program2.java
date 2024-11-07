//programm for a calculator
import java.util.*;

class program2 {
    public static void main(String[] args){

        


        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = obj.nextInt();
        
        System.out.print("Enter a character: ");
        char op = obj.next().charAt(0);
        
        System.out.print("Enter a Second number: ");
        int n2 = obj.nextInt();

        
        

        //calling our calculator
        cal(n1, n2, op);
   
        
    }


    public static void cal(int n1, int n2, char op) {
            switch (op) {
                case '+' : System.out.println(n1 + n2);
                break;

                case '-' : System.out.println(n1 - n2);
                break;

                case '*' : System.out.println(n1 * n2);
                break;

                case '/' : System.out.println(n1 / n2);
                break;

                case '%' : System.out.println(n1 % n2);
                break;

                default: System.out.print("Invalid operator");
            }
        }


}


