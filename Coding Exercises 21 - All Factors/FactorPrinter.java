public class FactorPrinter {
    // write your code here
    public static void printFactors(int number){
        if(number<1){
            System.out.print("Invalid Value");
        }else{
            for(int i=1;i<=number;i++){
                if(number%i == 0){
                    System.out.print(""+i+" ");
                }
            }
        }
    }
}