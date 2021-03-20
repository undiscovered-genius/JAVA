import java.util.ArrayList;
public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches;
    
    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    
    public boolean addBranch(String branchName){
        if(findBranch(branchName) != null){
            return false;
        }
        this.branches.add(new Branch(branchName));
        return true;
    }
    
    public boolean addCustomer(String branchName, String customerName, double initialTrans){
        Branch branch = findBranch(branchName);
        if(branch != null){
           return branch.newCustomer(customerName,initialTrans);
            // return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
           return branch.addCustomerTransaction(customerName,transaction);
            // return true;
            
        }
        return false;
    }
    
    private Branch findBranch(String branchName){
        for(int i=0;i<this.branches.size();i++){
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }
    
    public boolean listCustomers(String branchName, boolean printTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch "+branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0;i<branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: "+branchCustomer.getName()+"["+(i+1)+"]");
                
                if(printTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0;j<transactions.size();j++){
                        System.out.println("["+(j+1)+"] Amount "+ transactions.get(j));
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }
}