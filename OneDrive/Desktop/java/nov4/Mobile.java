public class Mobile {
    int ram;
    String model;

    public static void detail(int ram, String model){
        this.ram = ram;
        this.model = model;
        System.out.println("RAM : " + ram + "GB Model: " + model );

    }

    public static void main(String[] args){
        Mobile m1 = new Mobile();   //object created for Mobile class
        m1.detail(16,"iphone");     //initialized the m1 object
    }
    Mobile.detail(16,"samsung");
}