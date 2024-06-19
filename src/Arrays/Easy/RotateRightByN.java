public class RotateRightByN {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9}, n=9, k=3;
        rotate(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void rotate(int[] arr, int n, int k) {
        // Reverse first n-k elements
        Reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        Reverse(arr, n - k, n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
    }
    private static void Reverse(int arr[], int start, int end){

        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}