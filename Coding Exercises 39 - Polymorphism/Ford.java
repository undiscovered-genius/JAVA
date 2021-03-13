public class Ford extends Car{
    public Ford(int cylinders,String name){
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
