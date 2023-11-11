package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {7,2,6,9,8,3,1,4,5};
        int n = arr.length;

        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
