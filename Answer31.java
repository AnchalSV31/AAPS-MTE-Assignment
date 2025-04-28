//Use a deque to find the maximum in every sliding window of size K
import java.util.*;

public class Answer31 {
    //TC:O(N) SC:O(K)
    public static int[] maxSlidingWindow(int[] nums, int k){
        if(nums==null || k<=0) return new int[0];

        int n=nums.length;
        int[] list = new int[n - k + 1];
        int listi=0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            if(!dq.isEmpty() && dq.peek()==i-k){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1){
                list[listi++]=nums[dq.peek()];
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;
        int[] result=maxSlidingWindow(nums, k);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
