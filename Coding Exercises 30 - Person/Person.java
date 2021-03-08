public class Person {
    // write your code here
    private String firstName, lastName;
    private int age;
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setFirstName(String n){
        firstName = n;
    }
    
    public void setLastName(String l){
        lastName = l;
    }
    
    public void setAge(int a){
        if(a<0 || a>100){
            age = 0;
        }else{
            age = a;
        }
    }
    
    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }
        return false;
    }
    
    public String getFullName(){
        String empty = "";
        if(firstName.isEmpty() && lastName.isEmpty()){
            return empty;
        }else if(firstName.isEmpty() && !lastName.isEmpty()){
            return lastName;
        }else if(!firstName.isEmpty() && lastName.isEmpty()){
            return firstName;
        }
        return (firstName+" "+lastName);
    }
}