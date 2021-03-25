import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable{
    // write code here
    private String name, weapon;
    private int hitPoints, strength;
    
    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public void setStrength(int strength){
        this.strength = strength;
    }
    
    public int getHitPoints(){
        return hitPoints;
    }
    
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    
    @Override
    public List<String> write(){
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strength);
        values.add(3,this.weapon);
        return values;
    }
    
    @Override
    public void read(List<String> values){
        if(values != null && values.size()>0){
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3); 
        }
    }
    
    @Override
    public String toString(){
        return ("Player{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+", weapon='"+this.weapon+"'}");
    }
}