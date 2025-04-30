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

    //OPTIMAL SOLUTION[MOORE VOTING ALGO]
    //TC:O(N) SC:O(1)
    public static int majorityElement2(int arr[]){
        int n=arr.length;
        int count=0;
        int el=0;
        for(int i=0; i<n; i++){
            if(count==0){
                count=1;
                el=arr[i];
            }
            else if(arr[i]==el){
                count++;
            }
            else{
                count--;
            }
        }

        //checking if the stored element is the majority element:
        int count1=0;
        for(int i=0; i<n; i++){
            if(arr[i]==el){
                count1++;
            }
        }
        if(count1>(n/2)){
            return el;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement2(nums));
    }
}
