//find the longest palindromic substring in a given string
public class Answer46 {
    //TC:O(n^3) SC:O(1)
    public static String longestPalindrome(String s){
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int start=0, end=0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPalindrome(s,i,j)==true){
                    if((j-i+1)>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }

    public static boolean isPalindrome(String s, int i, int j){
        while (i<j) {
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "babad";
        System.out.println(longestPalindrome(s));
    }
}
