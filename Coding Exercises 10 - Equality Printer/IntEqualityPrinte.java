public class IntEqualityPrinter {
    // write your code here
    public static void printEqual(int i1,int i2,int i3){
        if(i1<0 || i2<0 || i3<0){
            System.out.println("Invalid Value");
        }else{
            if(i1==i2 && i2==i3){
                System.out.println("All numbers are equal");
            }else{
                if((i1 != i2) && (i1 != i3) && (i2 != i3)){
                    System.out.println("All numbers are different");
                }else{
                    System.out.println("Neither all are equal or different");
                }
            }
        }
    }
}