//find the largest rectangle that can be formed in a histogram.
import java.util.Stack;

public class Answer32{
    //TC:O(N) SC:O(N)
    public static int largestRectangleArea(int[] arr) {
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int element = st.peek();
                st.pop();
                int nse=i, pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, arr[element]*(nse-pse-1));
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int nse = n;
            int element = st.peek();
            st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, arr[element]*(nse-pse-1));
        } 
        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}