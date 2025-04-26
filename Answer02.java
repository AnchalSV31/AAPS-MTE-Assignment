//find the sum of elements in a given range [L,R] using a prefix sum array

public class Answer02{
    //TC: O(N) SC:O(N)
    public static int prefixSum(int[] arr, int l, int r){
        int n=arr.length;
        int[] prefix=new int[n+1];
        prefix[0]=arr[0];

        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        if(l==0){
            return prefix[r];
        }
        return prefix[r]-prefix[l-1];
    }

    public static void main(String[] args) {
        int[] arr={3,5,2,6,1};
        int l=1, r=3;
        System.out.println(prefixSum(arr, l, r));
    }
}