import java.lang.Math;
public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){
        int sum=0;
        String digit = Integer.toString(number);
        int num = digit.length();
        num = (int)Math.pow(10,num-1);
        System.out.println(""+num);
        if(number>=0){
            sum = sum+(number%10);
            sum = sum+(number/num);
            return sum;
        }
        return -1;
    }
}