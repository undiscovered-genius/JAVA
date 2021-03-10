public class Rectangle {
    // write your code here
    private double width , length;
    
    public Rectangle(double width, double length){
        if(width<0){
            this.width = 0;
        }else{
            this.width = width;
        }
        
        if(length<0){
            this.length = 0;
        }else{
            this.length = length;
        }
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getArea(){
        return (width*length);
    }
}