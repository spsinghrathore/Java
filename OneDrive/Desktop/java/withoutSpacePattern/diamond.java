class diamond {
    public static void main(String[] args){
        int n=9, st=1, sp=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1;j<sp;j++){
                System .out.print(" ");
            }
            for(int j=1;j<=st;j++){
               System.out.print("*");
            
            }
        if(i<=n/2) {
            st+=2;
             sp--;
        }
                else {
            st-=2;
             sp++;
        }

        System.out.println();
        }
    }
}