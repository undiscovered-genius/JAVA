public class PerfectNumber {
    // write your code here
    public static boolean isPerfectNumber(int number){
        int sum=0;
        if(number>=1){
            for(int i=1;i<number;i++){
                if(number%i == 0){
                    sum = sum+i;
                }
           }
           if(sum == number){
               return true;
           }
        }
        return false;
    }
}