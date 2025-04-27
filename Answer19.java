//maximum product subarray

public class Answer19 {
    public static int maxProduct(int[] nums, int k){
        int n= nums.length;
        if(n<k){
            return -1;
        }
        int max=1;
        for(int i=0; i<k; i++){
            max*=nums[i];
        }
        int currPro=max;
        for(int i=k; i<n; i++){
            currPro=(currPro/nums[i-k])*nums[i];
            max=Math.max(currPro, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        System.out.println(maxProduct(nums, 2));
    }
}
