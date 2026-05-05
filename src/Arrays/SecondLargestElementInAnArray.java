package Arrays;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,4};
        int n=arr.length;
        int secondLargest=findSecondLargestOptimal(arr,n);
        System.out.println("Second " +
                "Largest Element in an Array: "+secondLargest);
    }
    //Brute-force
    // Sort and return the arr[n-2] element(incase of duplicates traverse from back to get the second largest element)


    //Better Approach O(N)+O(N)
    private static int findSecondLargestBetter(int[] arr, int n) {
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int secondLargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    private static int findSecondLargestOptimal(int[] arr, int n) {
        int largest=arr[0];
        int secondLargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}
