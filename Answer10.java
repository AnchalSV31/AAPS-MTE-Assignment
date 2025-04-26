//Generate all permutations of a given string.
import java.util.*;

public class Answer10 {
    //TC:O(N*N!) SC:O(n)
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        backtrack(nums, new ArrayList<>(), ans);
        return ans; 
    }
    

    public static void backtrack(int[] nums,List<Integer> current, List<List<Integer>> ans){
        if(current.size()==nums.length){
            ans.add(new ArrayList<>(current)); 
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(current.contains(nums[i])){
                continue;
            }
            current.add(nums[i]);
            backtrack(nums, current, ans);
            current.remove(current.size()-1);
        }

    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> result=permute(nums);
        System.out.println(result);

    }
}
