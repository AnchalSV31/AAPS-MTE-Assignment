//Check if an array can be split into two parts such that the sum of the prefix equals the sum of the suffix

public class Answer04 {
    //TC: O(n)  SC: O(n)
    public static boolean canBeSplit(int[] arr){
        int n=arr.length;
        int[] leftSum= new int[n];
        int[] rightSum=new int[n];
        leftSum[0]=arr[0];
        for(int i=1; i<n; i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }
        rightSum[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightSum[i]=rightSum[i+1]+arr[i];
        }
        for(int i=0; i<n-1; i++){
            if(leftSum[i]==rightSum[i+1]){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums={1,5,11,5};
        System.out.println(canBeSplit(nums));
    }
}
