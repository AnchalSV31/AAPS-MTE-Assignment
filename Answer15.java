//k-th smallest element in a sorted matrix

public class Answer15 {
    //TC: O(n logn) SC:O(1)
    public static int kthSmallest(int[][] matrix, int k){
        int n=matrix.length;
        int m=matrix[0].length;
        int low=matrix[0][0];
        int high=matrix[n-1][m-1];
    
        while(low<high){
            int mid=low+(high-low)/2;
            int count=lessEqual(matrix, mid);
            if(count<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }

    public static int lessEqual(int[][] matrix, int target){
        int count=0;
        int len=matrix.length;
        int i=len-1;
        int j=0;

        while(i>=0 && j<len){
            if(matrix[i][j]>target){
                i--;
            }else{
                count+=i+1;
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,5,9},{10,11,13},{12,13,15}};
        int k=8;
        System.out.println(kthSmallest(matrix,k));
    }
}
