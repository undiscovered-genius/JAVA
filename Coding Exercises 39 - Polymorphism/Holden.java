public class Holden extends Car{
    public Holden(int cylinders,String name){
        super(cylinders,name);
    }
    
     public String startEngine(){
        return ("Engine "+getName()+" is starting");
    }
    
    public String accelerate(){
        return ("Car "+getName()+" is accelerating");
    }
    
    public String brake(){
        return ("Car "+getName()+" is braking");
    }
}
