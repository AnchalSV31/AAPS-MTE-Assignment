//d the length of the longest substring without repeating characters.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Answer06 {
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


        // int l=0, r=0;
        // int n= s.length();

        // if(n==0){
        //     return 0;
        // }

        // int maxL = Integer.MIN_VALUE;
        // Set<Character> set = new HashSet<>();

        // while(r<n){
        //     if(set.contains(s.charAt(r))){
        //     // maxL= Math.max(maxL, r-l+1);

        //         while(l<r && set.contains(s.charAt(r))){
        //             set.remove(s.charAt(l));
        //             l++;
        //         }
        //     }
        //     set.add(s.charAt(r));
        //     maxL= Math.max(maxL, r-l+1);
        //     r++;
        // }
        // return maxL;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
