package Arrays;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,4};
        int n=arr.length;
        int largest=findLargest(arr,n);
        System.out.println("Largest Element in an Array: "+largest);
    }

    //Brute-force
    // Sort and return the arr[n-1] element

    //Optimal Approach
    private static int findLargest(int[] arr, int n) {
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}
