package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,6,9,8,3,1,4,5};
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            for(int j=0;j<i;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
