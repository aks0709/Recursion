import java.util.ArrayList;
import java.util.List;

public class CombinationalSum
{
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int target=7;

        System.out.println(combinationSum2(arr,target));

    }
    static void combinationsum(int index,int arr[],int target,List<List<Integer>> list,List<Integer> list2)
    {
        //base case
        if(index==arr.length)
        {
            if(target==0)
            {
             list.add(new ArrayList<>(list2));
            }
            return;
        }

        //adding same index element till target =0;
        //case of picking first element
        if(arr[index]<=target) {
            list2.add(arr[index]);
            combinationsum(index, arr, target - arr[index], list, list2);
            //removing the element from the list that
            list2.remove(list2.size() - 1);
        }
        //case of not picking
        combinationsum(index+1,arr,target,list,list2);
    }
    static List<List<Integer>> combinationSum2(int[] candidates, int target)
    {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        combinationsum(0,candidates,target,res,new ArrayList<>());
        return res;

    }
}