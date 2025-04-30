//find the equilibrium index in an array

public class Answer03 {
    //TC:O(N) sc:O(N)
    public static int index(int[] arr){
        int n=arr.length;
        int[] prefixSum = new int[n+1];
        int[] suffixSum = new int[n+1];

        prefixSum[0]=arr[0];
        suffixSum[n-1]=arr[n-1];

        for(int i=1; i<n; i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }

        for(int i=n-2; i>=0; i--){
            suffixSum[i]=suffixSum[i+1]+arr[i];
        }

        for(int i=0; i<n; i++){
            if(prefixSum[i]==suffixSum[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={ 1,3,5,2,2};
        int ans=index(arr);

        if(ans!=-1){
            System.out.println("Equilibrium index: "+ ans);
        }else{
            System.out.println("Equilibrium index not found");
        }
    }
}
