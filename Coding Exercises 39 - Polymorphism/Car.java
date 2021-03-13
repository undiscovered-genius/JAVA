public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = wheels;
    }
    
    public String startEngine(){
        return ("Engine "+this.name+" is starting");
    }
    
    public String accelerate(){
        return ("Car "+this.name+" is accelerating");
    }
    
    public String brake(){
        return ("Car "+this.name+" is braking");
    }
    
    public String getName(){
        return name;
    }
    
    public int getCylinders(){
        return cylinders;
    }
}
