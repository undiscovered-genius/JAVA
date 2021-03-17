
import java.io.*; 
import java.util.*;
public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts= new ArrayList<Contact>();
    
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts =  new ArrayList<Contact>();
    }
    
    public boolean addNewContact(Contact c){
        if(findContact(c.getName()) >=0){
            return false;
        }
        myContacts.add(c);
        return true;
    }
    
    public boolean updateContact(Contact old,Contact newc){
        int position = findContact(old.getName());
        if(findContact(old.getName()) < 0){
            return false;
        }else if(findContact(newc.getName()) != -1){
            return false;
        }
        this.myContacts.set(position,newc);
        return true;
    }
    
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    
    private int findContact(String name){
        for(int i=0;i<myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position < 0){
            return false;
        }
        this.myContacts.remove(position);
        return true;
    }
    
    public Contact queryContact(String name){
        for(int i=0; i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }
    
    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0;i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            System.out.println(""+(i+1)+". "+contact.getName()+" -> "+contact.getPhoneNumber());
        }
    }
}