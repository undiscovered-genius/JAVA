public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name , healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;
    
    public HealthyBurger(String meat, double price){
        super("Healthy",meat,price,"");
    }
    
    public void addHealthyAddition1(String addition1Name, double addition1Price){
        this.healthyExtra1Name = addition1Name;
        this.healthyExtra1Price = addition1Price;
    }
    
    public void addHealthyAddition2(String addition2Name, double addition2Price){
        this.healthyExtra2Name = addition2Name;
        this.healthyExtra2Price = addition2Price;
    }
    
    public double itemizeHamburger() {
        double burgerPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            burgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            burgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return burgerPrice;
    }
}