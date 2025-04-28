//the maximum XOR of two numbers in an array

import java.util.Arrays;

public class Answer23 {
    public static int[] maximizeXOR(int[] nums, int[][] queries) {
        int[] result=new int[queries.length];
        for(int i=0; i<queries.length;i++){
            int x=queries[i][0];
            int m=queries[i][1];
            int max=-1;
            for(int num:nums){
                if(num<=m){
                    max=Math.max(x^num, max);
                }
            }
            result[i]=max;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[][] queries = {{3,1},{1,3},{5,6}};
        int[] ans= maximizeXOR(nums,queries);
        System.out.println(Arrays.toString(ans));
    }
}
