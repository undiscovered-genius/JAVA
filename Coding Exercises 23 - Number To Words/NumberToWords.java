public class NumberToWords {
    // write your code here
    public static void numberToWords(int number){
        if(number<0){
            System.out.print("Invalid Value");
        }else{
            // if(number == 0){
            //     System.out.print("Zero ");
            // }
            if(number==10){
                    System.out.print("One Zero");
            }else{
                    int rev,temp;
                    //number = reverse(number);
                    temp = number;
                    int count = getDigitCount(number);
                    int cnt=0;
                    number = reverse(number);
            while(number !=0){
                
                
                
                rev = number%10;
                number = number/10;
                cnt++;
                //System.out.println("rev"+rev);
                switch(rev){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
            }
            while(cnt != count){
                    System.out.print("Zero ");
                    cnt++;
                }
            }
        }
    }
    public static int reverse(int n){
        int r=0,x;
        if(n>=0){
            while(n !=0){
                r = (r*10)+(n%10);
                n = n/10;
            }
            return r;
        }else{
            n = n*(-1);
            r=0;
            while(n !=0){
                r = (r*10)+(n%10);
                n = n/10;
            }
            return r*(-1);
        }
    }
    public static int getDigitCount(int number){
        int count = 0;
        if(number>0){
            while(number !=0){
                number = number/10;
                count++;
            }
            return count;
        }
        if(number==0){
            return 1;
        }
        return -1;
    }
}