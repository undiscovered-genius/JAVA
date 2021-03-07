public class DiagonalStar {
    // write your code here
    public static void printSquareStar(int number){
        if(number<5){
            System.out.print("Invalid Value");
        }else{
            int d1=1;
            int d2=number;
            for(int r=1;r<=number;r++){
                for(int c=1;c<=number;c++){
                    if(r==1 || r==number){
                        System.out.print("*");
                    }else{
                        if(c==1 || c==number){
                            System.out.print("*");
                        }else if(c==d1 || c==d2){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
                d1++;
                d2--;
            }
        }
    }
}