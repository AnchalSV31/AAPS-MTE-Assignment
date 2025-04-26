//longest common prefix among a list of strings
import java.util.*;
public class Answer9 {
    //TC: O(m × log n + k)  SC: O(k)
    public static String longestCommonPrefix(String[] strs) {
        int n= strs.length;
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first= strs[0];
        String last= strs[n-1];

        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] str= {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
