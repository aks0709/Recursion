import java.util.*;

public class NoDuplicatesSubsetUsingHashSet {
    public static void main(String[] args) {

        int nums[]={1,2,2};
        List < String > ans = subsetsWithDup(nums);
        printAns(ans);
    }

    static void printAns(List<String> ans) {
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString().replace(",", " "));
    }

    public static void fun(int[] nums, int index, List<Integer> ds, HashSet<String> res) {
        if (index == nums.length) {
            Collections.sort(ds);
            res.add(ds.toString());
            return;
        }
        ds.add(nums[index]);
        fun(nums, index + 1, ds, res);
        ds.remove(ds.size() - 1);
        fun(nums, index + 1, ds, res);
    }

    public static List<String> subsetsWithDup(int[] nums) {
        List<String> ans = new ArrayList<>();
        HashSet<String> res = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        fun(nums, 0, ds, res);
        for (String it : res) {
            ans.add(it);
        }
        return ans;
    }
}
