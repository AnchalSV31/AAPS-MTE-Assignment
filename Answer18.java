//maximum XOR of two numbers in an array.
import java.util.*;

public class Answer18 {
    public static int findMaximumXOR(int[] nums) {
        int res = 0;
        int mask = 0;
        int n = nums.length;
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            Set<Integer> set = new HashSet<>(n);
            for (int j = 0; j < n; j++) {
                set.add(nums[j] & mask);
            }
            int target = res | (1 << i);
            for (int prefix : set) {
                if (set.contains(prefix ^ target)) {
                    res = target;
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={3,10,5,25,2,8};
        System.out.println(findMaximumXOR(nums));
    }
}
