public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int rev=0,temp;
        if(number<0){
            temp = number;
            rev = 0;
            while(temp !=0){
                rev = (rev*10)+(temp%10);
                temp = temp/10;
            }
        }else{
            number = number*(-1);
            temp = number;
            rev =0;
            while(temp !=0){
                rev = (rev*10)+(temp%10);
                temp = temp/10;
            }
        }
        if(rev == number){
            return true;
        }
        return false;
    }
}