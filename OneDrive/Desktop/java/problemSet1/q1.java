import java.util.*;
class q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter you name : ");
        String name = obj.next();
      //supposing user enter correct mobile number!
        System.out.print("Your mobile number: ");
        String  num = obj.next();

        System.out.print("Enter your 10th percentage : ");
        int tenPercent = obj.nextInt();

        System.out.print("Enter your 12th percentage : ");
        int twelPercent = obj.nextInt();

        System.out.print("Enter your degree percentage : ");
        int degreePer = obj.nextInt();

        System.out.print("Name: " + name);
        System.out.print("Mobile Number: " + num);
        System.out.print("1oth" + tenPercent);
        System.out.print("12th" + twelPercent);
        System.out.print("Degree" + degreePer);
        
    }
    }
