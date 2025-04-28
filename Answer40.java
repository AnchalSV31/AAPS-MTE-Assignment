//find the element with maximum frequency in an array.

import java.util.HashMap;
import java.util.Map;

public class Answer40 {
    //TC:O(N) SC:O(N)
    public static int maxFrequency(int[] nums){
        // HashMap<Integer,Integer> h=new HashMap<>();
        // for(int num:nums){
        //     if(h.containsKey(num)){
        //         h.put(num, h.get(num)+1);
        //     }else{
        //         h.put(num,1);
        //     }
        // }
       HashMap<Integer, Integer> h = new HashMap<>();
        
        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int maxElement = -1;

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }
    
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4};
        System.out.println(maxFrequency(nums));
    }
}
