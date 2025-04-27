//find the element with maximum frequency in an array.

import java.util.HashMap;

public class Answer40 {
    //TC:O(N) SC:O(N)
    public static int maxFrequency(int[] nums){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int num:nums){
            if(h.containsKey(num)){
                h.put(num, h.get(num)+1);
            }else{
                h.put(num,1);
            }
        }
        int max=0;
        for(int val:h.values()){
            max=Math.max(val, max);
        }
        int res=0;
        for(int frq:h.values()){
            if(frq==max){
                res+=frq;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4};
        System.out.println(maxFrequency(nums));
    }
}
