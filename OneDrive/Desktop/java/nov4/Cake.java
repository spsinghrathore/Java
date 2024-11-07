class Cake {
    String name;
    String flavour;
    int price;

    public void initialize(String name, String flavour, int price) {
        this.name = name;
        this.flavour = flavour;
        this.price = price;
    }
    public void detail(){
        System.out.println("Name: " + name);
        System.out.println("Flavour: " + flavour);
        System.out.println("Price: " + price +"$");

    }

    public static void main(String[] args) {
        Cake c1 = new Cake();
        c1.initialize("Black Forest", "Chocolate",1000 );
        c1.detail();
    }
    

}