class Constructor {
    String vidName;
    int duration;
    String size;

    public Constructor(String vidName){
        this.vidName = vidName;

    }
     public Constructor(String vidName, int duration){
        this.vidName = vidName;
        this.duration = duration;

    }
     public Constructor(String vidName, int duration,String size){
        this.vidName = vidName;
        this.duration = duration;
        this.size = size;

    }

}
