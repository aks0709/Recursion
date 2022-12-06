import java.util.ArrayList;
import java.util.List;

public class PermutationSwapApproach
{
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(GetPermutation(arr));

    }
    static void Permutations(int index, int nums[], List<List<Integer>> ans)
    {
        //base case
        if(index==nums.length)
        {
            List<Integer> ds=new ArrayList<>();
            for(int i:nums)
            {
                ds.add(i);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i=index;i<nums.length;i++)
        {
            swap(index,i,nums);  //swap the indexes to generate permutation
            Permutations(index+1,nums,ans);  //recursive calls for index+1;
            swap(index,i,nums);  //ReSwap the indexes for further recursive calls
        }
    }
    static List<List<Integer>> GetPermutation(int nums[])
    {
        List<List<Integer>> res=new ArrayList<>();
        Permutations(0,nums,res);
        return res;
    }

    static void swap(int a,int b,int arr[])
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
