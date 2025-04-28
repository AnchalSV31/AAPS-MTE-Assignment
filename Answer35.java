//k-most frequent elements in an array using a priority queue.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Answer35 {
    //TC:O(N log k) SC:O(N)
    public static int[] topKFrequent(int[] nums, int k){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            heap.offer(entry);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll().getKey();
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        int[] res = topKFrequent(nums, k);
        System.out.println(Arrays.toString(res)); 
    }
}
