// Generate all subsets of a given array
import java.util.*;
public class Answer36 {
    //TC:O(n × 2ⁿ) SC:O(n × 2ⁿ)
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());

        for(int num:nums){
            int n=result.size();
            for(int i=0; i<n; i++){
                List<Integer> temp=new ArrayList<>(result.get(i));
                temp.add(num);
                result.add(temp);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> result=subsets(nums);
        System.out.println(result);
    }
}
