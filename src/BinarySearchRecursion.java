public class BinarySearchRecursion
{
    public static void main(String[] args)
    {
        int arr[]={2,4,6,8,189};
        int target=18;
        int start=0;
        int end=arr.length-1;
        boolean result=search(arr,target,start,end);
        if (result)
            System.out.println("element is present");
        else
            System.out.println("element not present");
    }

    static boolean search(int arr[],int target,int start,int end)
    {
        if (start>end)
            return false;

        if (end>=start&&start<=arr.length-1) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;

            if (arr[mid] < target) {
                return search(arr, target, mid + 1, end);
            } else {
                return search(arr, target, start, mid - 1);
            }
        }
        return false;
    }
}
