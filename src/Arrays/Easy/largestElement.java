public class largestElement {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4,7,2,1,5,9,12};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}