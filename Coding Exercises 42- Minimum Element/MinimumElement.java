
import java.util.Scanner;
public class MinimumElement {
    // write code here
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        
        return len;
    }
    
    private static int[] readElements(int n){
        int[] arr =  new int[n];
        Scanner scanner =  new Scanner(System.in);
        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            arr[i] = a;
        }
        return arr;
    }
    
    private static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}