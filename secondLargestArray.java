import java.util.Arrays;
public class secondLargestArray{
    public static void main(String[] args){
        int[] arr = {10, 45, 23, 89, 34};
        Arrays.sort(arr);
        
        int secondLargest = arr[arr.length - 2];

        System.out.println("Second Largest = " + secondLargest);
    }
}


