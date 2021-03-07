public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int a, int b){
        if(a<=(99) && a>=10 && b<=(99) && b>=10){
           int lefta = a/10;
           int righta = a % 10;
           int leftb = b/10;
           int rightb = b % 10;
           if(lefta == leftb || lefta == rightb || righta == leftb || righta ==rightb){
              return true;  
      } 
        }
        return false;
    }
}