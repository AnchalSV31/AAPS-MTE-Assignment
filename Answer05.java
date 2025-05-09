//. Find the maximum sum of any subarray of size K in a given array

public class Answer05 {
    public static int maxSumSubarray(int[] arr, int k){
        int n=arr.length;
        int sum=0;
        int maxSum=0;
        
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }

        maxSum=sum;

        for(int i=k; i<n; i++){
            // sum=sum-arr[i-1]+arr[i+k-1];
            sum=sum+arr[i]-arr[i-k];
            maxSum=Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={100,200,300,400}; 
        int k=2;
        System.out.println(maxSumSubarray(arr,k));
    }
}

