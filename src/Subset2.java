import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2
{
    public static void main(String[] args) {

        int arr[]={1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
    static void GetSubsets(int index, int nums[], List<List<Integer>> anslist,List<Integer> ds)
    {
        anslist.add(new ArrayList<>(ds));
        for (int i=index;i<nums.length;i++)
        {
            if(i!=index&&nums[i]==nums[i-1]) continue;

            ds.add(nums[i]);
            GetSubsets(i+1,nums,anslist,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> anslist=new ArrayList<>();
        GetSubsets(0,nums,anslist,new ArrayList<>());
        return anslist;
    }
}
