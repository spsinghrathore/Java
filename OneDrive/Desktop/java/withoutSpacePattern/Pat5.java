class Pat5 {
    public static void main(String[] args){
        for(int i =1; i<=5; i++) {

            for(int j=1 ; j<=5-i; j++){            //space
                System.out.print(" ");
                }
            
            for(int j=1;j<=2*i-1; j++){            //j :   1 to  (2*i-1)  
                if(j){
                    System.out.print(1);
                }   
                else {
                    System.out.print(0);
                }                                 //print : opposite of j%2
            }
            System.out.println();
        }
    }
}