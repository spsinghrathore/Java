class Status {
    String msg;
    String uploadTime;
    int numOfViews;

    {
        System.out.println("non static block called!");
    }

    public Status(String msg){
        this.msg = msg;
        System.out.println("1st constructoe called");
    }
    public Status(String uploadTime, String msg){
        this.uploadTime = uploadTime;
        this.msg = msg;
        System.out.println("2nd constructoe called");
    }

    public Status(String msg, String uploadTime, int numOfViews){
        this.msg = msg;
        this.uploadTime = uploadTime;
        this.numOfViews = numOfViews;
        System.out.println("3rd constructoe called");

    }

    public void detail(){
        System.out.println(msg);
        System.out.println(uploadTime);
        System.out.println(numOfViews);
    }

   
}