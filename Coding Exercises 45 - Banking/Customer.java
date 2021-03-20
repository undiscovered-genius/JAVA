import java.util.ArrayList;
public class Customer {
    // write code here
    private String name;
    private ArrayList<Double> transactions;
    
    public Customer(String name,double transaction){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(transaction);
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Double> getTransactions(){
        return transactions;
    }
    
    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }
}