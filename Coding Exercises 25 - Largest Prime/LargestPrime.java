public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number){
        if(number>0){
            int temp=-1;
            for(int i=2;i<=number;i++){
                if(number%i == 0){
                    number /= i;
                    temp = i;
                    i--;
                }
            }
            // if((number/10)==0){
            //     for(int i=2;i<=number;i++){
            //     if(number%i == 0){
            //         number /= i;
            //         temp = i;
            //     }
            // }
            //}
            return temp;
        }
        return -1;
    }
}