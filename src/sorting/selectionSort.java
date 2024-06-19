package sorting;
import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {7,2,3,8,6,1,4};


        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int mini = i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
