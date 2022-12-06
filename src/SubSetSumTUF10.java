import java.util.ArrayList;
import java.util.Collections;

public class SubSetSumTUF10
{
    public static void main(String[] args) {
        int arr[]={3,1,2};
        System.out.println(GetSumList(arr));

    }
    static void GetSum(int index, int arr[], int sum, ArrayList<Integer> Subset)
    {
        if(index==arr.length)
        {
            Subset.add(sum);
            return;
        }

        GetSum(index+1,arr,sum+arr[index],Subset);

        GetSum(index+1,arr,sum,Subset);
    }
    static ArrayList<Integer> GetSumList(int arr[])
    {
        ArrayList<Integer> ans=new ArrayList<>();
        GetSum(0,arr,0,ans);
        Collections.sort(ans);
        return ans;
    }

}
