//the maximum XOR of two numbers in an array

public class Answer23 {
    
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] queries = {{3,1},{1,3},{5,6}};
        int[] ans= maximizeXOR(nums,queries);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
