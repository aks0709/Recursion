 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationalSum2
{
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(arr,target));

    }
    //bruteForce
    //we use hashSet to avoid Duplicates
    //later on hashSet is Converted in list of list
    //but now time complexity become(2^n *K)*(additional Logn due to set data structure)


        static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
                return;
            }

            for(int i = ind; i < arr.length;i++) {
                if(i > ind && arr[i] == arr[i-1]) continue;
                if(arr[i]>target) break;

                ds.add(arr[i]);
                findCombinations(i+1, arr, target - arr[i], ans, ds);
                ds.remove(ds.size() - 1);
            }
        }
        public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(candidates);
            findCombinations(0, candidates, target, ans, new ArrayList<>());
            return ans;
        }
    }

