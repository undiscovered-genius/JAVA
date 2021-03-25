import java.util.List;
import java.util.ArrayList;

public class Monster implements ISaveable{
    // write code here
    private String name;
    private int hitPoints, strength;
    
    public Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    
    public String getName(){
        return name;
    }
    
    public int getHitPoints(){
        return hitPoints;
    }
    
    public int getStrength(){
        return strength;
    }
    
    @Override
    public List<String> write(){
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strength);
        return values;
    }
    
    @Override
    public void read(List<String> values){
        if(values != null && values.size()>0){
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
        }
    }
    
    @Override
    public String toString(){
        return ("Monster{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+"}");
    }
}