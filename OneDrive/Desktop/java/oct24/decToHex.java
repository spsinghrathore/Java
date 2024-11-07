import java.util.*;
class decToHex {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");
        int num = obj.nextInt();
        String res = decToHex(num);
        System.out.println(res);
    }

    public static String decToHex(int num){
     String hex = " ";
     do{
          int l = num%16;
          if(l<9){
              hex= l + hex;
                }         
          else {
                 hex = (char)(l+55) + hex;
               }
               num/= 16;
     }while(num!=0);
     return hex;

}
}