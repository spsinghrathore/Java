class constructor {
    String vidName;
    int duration;
    String size;

    public constructor(String vidName){
        this.vidName = vidName;

    }
     public constructor(String vidName, int duration){
        this.vidName = vidName;
        this.duration = duration;

    }
     public constructor(String vidName, int duration,String size){
        this.vidName = vidName;
        this.duration = duration;
        this.size = size;

    }

    public void detail(){
        System.out.println("Title: " + vidName);
        System.out.println("Duration: " + duration);
        System.out.println("Size: " + size);
    }

    public static void main(String[] args){
        constructor vid1 = new constructor("Java in 18 minutes",18,"180mb");
        vid1.detail();
    }

}
