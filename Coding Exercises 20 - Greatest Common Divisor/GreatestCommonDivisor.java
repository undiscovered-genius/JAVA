public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int first, int second){
        int div,r;
        if(first>=10 && second>=10){
            while(first != 0){
               div =  second/first;
               r = second%first;
               second = first;
               first = r;
            }
            return second;
        }
        return -1;
    }
}