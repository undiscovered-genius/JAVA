public class LastDigitChecker {
    // write your code here
    public static boolean hasSameLastDigit(int x,int y,int z){
        if(x>=10 && x<=1000 && y>=10 && y<=1000 && z>=10 && z<=1000 ){
            x = x%10;
            y = y%10;
            z = z%10;
            if(x==y || x==z || y==z){
                return true;
            }
        }
        return false;
    }
    public static boolean isValid(int n){
        if(n>=10 && n<=1000){
            return true;
        }
        return false;
    }
}