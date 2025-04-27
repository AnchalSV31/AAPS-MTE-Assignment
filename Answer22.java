//check if a number is a power of two using bit manipulation

public class Answer22 {
    //TC:O(1) sc:O(1)
    public static boolean isPowerOfTwo(int n){
        //In Java, the maximum positive value for a 32-bit signed integer (int) is 2³¹ - 1, which is 2,147,483,647. 
        //Hence we will take 2^30 is 1,073,741,824
        //2^31 is negative

        // for(int i=0; i<31; i++){
        //     int ans=(int)Math.pow(2,i);
        //     if(ans==n){
        //         return true;
        //     }
        // }
        // return false;

        //Or

        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println(isPowerOfTwo(n));
    }
}
