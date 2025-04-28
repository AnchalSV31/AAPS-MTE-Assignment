//finding the subarray sum equal to K using hashing

import java.util.HashMap;

public class Answer34 {
    //TC:O(N) SC:O(N)
    public static int subarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);  //empty subarray with sum 0

        int sum=0, count=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,1,3,1,1};
        int k=2;
        System.out.println(subarraySum(nums, k));
    }
}
