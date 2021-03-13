public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders,String name){
        super(cylinders,name);
    }
    
     public String startEngine(){
        return ("Mitsubishi Engine "+getName());
    }
    
    public String accelerate(){
        return ("Mitsubishi Car "+getName()+" is accelerating");
    }
    
    public String brake(){
        return ("Mitsubishi Car "+getName()+" is braking");
    }
}
