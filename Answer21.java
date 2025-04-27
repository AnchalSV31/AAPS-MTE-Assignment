//count the number of 1s in the binary representation of numbers from 0 to n

import java.util.Arrays;

public class Answer21 {
    public static int[] countBits(int n){
        int[] res= new int[n+1];
        res[0]=0;
        for(int i=1; i<=n; i++){
            // res[i]=res[i>>1]+(i&1);  //right shift(divide by 2)  // check if last bit is 1(odd number)
            res[i]=res[i/2]+(i%2);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);
        System.out.println(Arrays.toString(result));
    }
}
