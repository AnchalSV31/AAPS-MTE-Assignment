//d the length of the longest substring without repeating characters.

import java.util.HashMap;

public class Answer6 {
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0 || s==null) return 0;
        
        int i=0, j=0;
        int maxLength=0;

        HashMap<Character, Integer> map = new HashMap<>();

        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                i=map.get(ch)+1;
            }
            map.put(ch,j);
            maxLength=Math.max(maxLength, j-i+1);
            j++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
