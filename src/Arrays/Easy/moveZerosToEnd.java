public class moveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,5,0,0,0,1,5,4,6};
        int j =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }


        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}