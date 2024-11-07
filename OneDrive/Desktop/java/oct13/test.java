class test {
   static int a=10;
    public static void main(String[] ankit) {
        
        test(a);
                                                                                                                                                                        int b=20;
                                                                                                                                                                        int c=30;

                                                                                                                                             int sum = a>b ? (a>c ? a: c) : (b>c ? b : c);
          
                                                                                                                                         System.out.println(sum);  
    System.out.println(a);   
    }

    public static void test(int a) {
        test.a=30;
    }
}
