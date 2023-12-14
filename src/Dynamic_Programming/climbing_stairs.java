public class climbing_stairs{
    public static void main(String[] args){
        int n = 5; // no. of stairs

        int prev=1, prev2=1;

        for(int i=2;i<=n;i++){
            int curr = prev + prev2;
            prev = curr;
            prev2 = prev;
        }

        System.out.println(prev);
    }
}