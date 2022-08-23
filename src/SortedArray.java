import java.util.ArrayList;

public class SortedArray
{
    public static void main(String[] args) {
        int arr[]={2,4,6,8,70};
        System.out.println(isSorted(arr,0));
    }
     static boolean isSorted(int arr[],int index)
     {
//base conditon
         if (index==arr.length-1) {
             return true;
         }

         return (arr[index]<arr[index+1]&&isSorted(arr,index+1));
     }
}
