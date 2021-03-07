public class EvenDigitSum {
    // write your code here
    public static int getEvenDigitSum(int number){
        int sum=0;
        String digit = Integer.toString(number);
        int num = digit.length();
        num = (int)Math.pow(10,num-1);
        System.out.println(""+num);
        if(number>=0){
            // number = number/10;
            while(number !=0){
                if((number%10)%2==0){
                    sum = sum+ number%10;
                }
                number = number/10;
            }
            return sum;
        }
        return -1;
    }
}