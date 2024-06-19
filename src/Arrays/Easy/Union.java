import java.util.*;

public class Union {
    public static void main(String[] args) {
        int arr1[] = {1,5,6,4,8,9,7,4,5,2,55,6,4,1,2,21};
        int arr2[] = {1,5,2,4,8,6,5,4,4,1,2,5,1,5,2,2,2,1,1,1,111,4,1,4};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0;i<arr1.length;i++) set.add(arr1[i]);
        for(int i=0;i<arr2.length;i++) set.add(arr2[i]);

        for(int item : set){
            System.out.print(item +", ");
        }
    }
}