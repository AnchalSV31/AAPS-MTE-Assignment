//Rearrange numbers into the lexicographically next greater permutation

public class Answer12 {
    //TC:O(N) SC:O(1)
    public static int[] nextPermutation(int[] nums){
        int n= nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        } 
        if(i>=0){
            int j=n-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
        return nums;
    }

    public static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }

    public static void reverse(int[] nums, int i, int j){
        int start=i, end=j;
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] ans=nextPermutation(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
