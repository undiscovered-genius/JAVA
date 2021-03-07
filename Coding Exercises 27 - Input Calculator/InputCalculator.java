import java.util.Scanner;
 
public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage(){
         int sum = 0, count = 0;
         double avg =0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean number = sc.hasNextInt();

            if (number) {
                int data = sc.nextInt();
                sum = sum + data;
                count++;
            } else if (count == 0){
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                avg = (double)sum/count;
                avg = Math.round(avg);
                System.out.println("SUM = " + sum + " AVG = " + (int)avg);
                break;
            }
            sc.nextLine();
        }
        // sc.close();
    }
}