import java.io.*; 
import java.util.*;

public class ReverseArray {
    // write code here
    private static void reverse(int[] arr){
        int temp;
        String Arr = Arrays.toString(arr);
        System.out.print("Array = "+Arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length - (i+1);j++){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        String stringArr = Arrays.toString(arr);
        System.out.println("Reversed array = "+stringArr);
    }
}