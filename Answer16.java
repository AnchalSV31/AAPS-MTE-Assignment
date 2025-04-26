//majority element in an array that appears more than n/2 times

public class Answer16 {
    //TC:O(N^2) SC:O(1)
    public static int majorityElement(int[] nums){
        int n=nums.length;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(majorityElement(nums));
    }
}
