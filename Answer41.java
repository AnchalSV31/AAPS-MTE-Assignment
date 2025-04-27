//find the maximum subarray sum using Kadane’s algorithm.
public class Answer41 {
    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<n; i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};
        System.out.println(maxSubArray(arr));
    }
}
