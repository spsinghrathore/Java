class camera {
    String company;
    int price;

    public camera(String company){
        this.company = company;

    }
     public camera(String company, int price){
        this.company = company;
        this.price = price;

    }
     

    public void detail(){
        System.out.println("Camera: " + company);
        System.out.println("Price: " + price +"$");
        
    }

    public static void main(String[] args){
        camera c1 = new camera("Sony",150000);
        c1.detail();
    }

}
