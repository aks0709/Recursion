import java.util.Arrays;

public class BasicRecursiveProblemsTUF4
{
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 2};
        //reversedArray(arr,0, arr.length-1);
        reversedArray2(arr,0);
        System.out.println(Arrays.toString(arr));
        String str="ABcCBA";
        System.out.println(isPalindrome(str,0,str.length()-1));
    }
    static void reversedArray( int[] arr,int l,int r) //with two pointers
    {
        if(l>=r)
            return;

        swap(arr,l,r);  // we swap first and ast indexby own
        reversedArray(arr,l+1,r-1);  //later on recursion will handle
    }
    static void reversedArray2( int[] arr,int i) //with two pointers
    {
        if(i>= arr.length/2)
            return;

        swap(arr,i,arr.length-i-1);  // we swap first and ast indexby own
        reversedArray2(arr,i+1);  //later on recursion will handle
    }
    static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static boolean isPalindrome(String str,int start,int end)
    {
        if(start>=end)
            return true;

        if (str.charAt(start)!=str.charAt(end))
            return false;

        return isPalindrome(str,start+1,end-1);
    }
}
