public class NumberInWord {
    // write your code here
    public static void printNumberInWord(int num){
        int nm;
    
            // while(num !=0){
                // nm = num%10;
                // num = num/10;
                switch(num){
                    case 0:
                        System.out.print("ZERO");
                        break;
                    case 1:
                        System.out.print("ONE");
                        break;
                    case 2:
                        System.out.print("TWO");
                        break;
                    case 3:
                        System.out.print("THREE");
                        break;
                    case 4:
                        System.out.print("FOUR");
                        break;
                    case 5:
                        System.out.print("FIVE");
                        break;
                    case 6:
                        System.out.print("SIX");
                        break;
                    case 7:
                        System.out.print("SEVEN");
                        break;
                    case 8:
                        System.out.print("EIGHT");
                        break;
                    case 9:
                        System.out.print("NINE");
                        break;
                    default:
                    System.out.print("OTHER");
                    
                }
            }
    // }
}