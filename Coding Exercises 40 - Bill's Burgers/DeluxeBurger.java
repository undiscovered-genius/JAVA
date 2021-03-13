public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("basic","chicken",10.10,"white");
        super.addHamburgerAddition1("Chips", 5);
        super.addHamburgerAddition2("Drink", 4);
    }
    
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
       System.out.println("Cannot add additional items to a deluxe burger.");
    }
    
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println("Cannot add additional items to a deluxe burger.");
    }
    
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
       System.out.println("Cannot add additional items to a deluxe burger.");
    }
    
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
       System.out.println("Cannot add additional items to a deluxe burger.");
    }
}