//Check if an array can be split into two parts such that the sum of the prefix equals the sum of the suffix

public class Answer04 {
    //TC: O(n * sum/2)  SC: O(sum/2)
    public static boolean canBeSplit(int[] nums){
        int n=nums.length;
        int totalSum=0;
        for(int i=0; i<n; i++){
            totalSum+=nums[i];
        }
        if(totalSum%2!=0){
            return false;
        }
        int target=totalSum/2;
        boolean dp[] = new boolean[target+1];
        dp[0]=true;

        for(int num: nums){
            for(int i=target; i>=num; i--){
                dp[i]=dp[i] || dp[i-num];
            }
        }
        return dp[target];
    }


    public static void main(String[] args) {
        int[] nums={1,5,11,5};
        System.out.println(canBeSplit(nums));
    }
}
