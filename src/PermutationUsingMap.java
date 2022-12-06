import java.util.ArrayList;
import java.util.List;

public class PermutationUsingMap
{
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(GetPermutation(arr));

    }
    static void Permutations(int arr[], List<List<Integer>> ans,List<Integer> ds,boolean freq[])
    {
        //base case
        if(ds.size()==arr.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(!freq[i]) //means if freq[i] is false/not marked/not taken
            {
                freq[i]=true;
                ds.add(arr[i]);
                Permutations(arr,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    static  List<List<Integer>> GetPermutation(int arr[])
    {
        List<List<Integer>> res=new ArrayList<>();
        boolean freq[]=new boolean[arr.length];
        Permutations(arr,res,new ArrayList<>(),freq);
        return res;
    }
}
