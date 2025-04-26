//median of two sorted arrays using binary search

public class Answer14 {
    //TC:O(n1+n2) SC:O(n1+n2)
    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        
        int[] arr3= new int[n1+n2];

        int i=0, j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]) arr3[i+j]=arr1[i++];
            else arr3[i+j]=arr2[j++];
        }
        while(i<n1) arr3[i+j]=arr1[i++];
        while(j<n2) arr3[i+j]=arr2[j++];
        int n= n1+n2;
        if(n%2==1) return arr3[n/2];

        return (double)((double)(arr3[n/2]+(double)(arr3[n/2-1]))/2.0);
    }

    public static void main(String[] args) {
        int[] arr1={1, 4, 7, 10, 12};
        int[] arr2={2, 3, 6, 15};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
