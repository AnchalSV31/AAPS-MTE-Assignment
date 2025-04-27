//Count all numbers with unique digits for a given number of digits.

public class Answer20 {
    //TC:O(n) SC:O(1)
    public static int count(int n){
        int temp=1;
        if(n>0){
            for(int i=0; i<n; i++){
                int p=1;
                for(int j=0; j<=i; j++){
                    if(j==0){
                        p*=9;
                    }else{
                        p*=10-j;
                    }
                }
                temp+=p;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(count(n));
    }
}
