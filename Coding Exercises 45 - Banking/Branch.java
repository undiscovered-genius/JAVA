import java.util.ArrayList;
public class Branch {
    // write code here
    private String name;
    private ArrayList<Customer> customers;
    
    public Branch(String branchName){
        this.name = branchName;
        this.customers = new ArrayList<Customer>();
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Customer> getCustomers(){
        return customers;
    } 
    
    public boolean newCustomer(String customerName,double transaction){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            this.customers.add(new Customer(customerName,transaction));
            return true;
        }
        return false;
    }
    
    public boolean addCustomerTransaction(String customerName, double transaction){
        
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.addTransaction(transaction);
                return true;
        }
        return false;
    }
    
    private Customer findCustomer(String customerName){
        for(int i=0;i<customers.size();i++){
            Customer customer = this.customers.get(i);
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }
}