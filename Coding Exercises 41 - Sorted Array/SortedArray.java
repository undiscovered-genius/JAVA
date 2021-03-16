import java.util.Scanner;
public class SortedArray {
    // write code here
    
    public static int[] getIntegers(int num){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            int scan = scanner.nextInt();
            arr[i] = scan;
        }
        return arr;
    }
    
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
    
    public static int[] sortIntegers(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}