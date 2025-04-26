//two numbers in a sorted array that add up to a target

public class Answer11 {
    //TC:O(N) SC:O(1)
    public static int[] twoSum(int[] nums, int target){
        int start=0;
        int end=nums.length-1;

        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==target){
                return new int[]{start, end};
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] result=twoSum(arr, target);
        System.out.println(result[0]+","+result[1]);
    }
}
