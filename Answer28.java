 //Implement two stacks in a single array
import java.util.*;

public class Answer28 {
    //TC: O(N)SC:O(N)
    public static List<String> buildArray(int[] target, int n) {
        List<String> result= new ArrayList<>();
        int num=1, index=0;

        while(num<=n && index<target.length){
            if(num==target[index]){
                result.add("Push");
                index++;
            }else{
                result.add("Push");
                result.add("Pop");
            }
            num++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] target={1,3};
        int n=3;
        List<String> ans=buildArray(target,n);
        System.out.println(ans);
    }
    
}
