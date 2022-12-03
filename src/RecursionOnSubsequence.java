import java.util.ArrayList;

public class RecursionOnSubsequence
{
    public static void main(String[] args) {
        int arr[]={3,1,2,8};
        PrintAllSubsequences(0,arr,new ArrayList<>());
    }
    static void PrintAllSubsequences(int index,int arr[], ArrayList<Integer> list)
    {
        if(index>= arr.length)
        {
            System.out.print(list+"  ");
            return;
        }

        //take it
        list.add(arr[index]);
        PrintAllSubsequences(index+1,arr,list);
        //leave it
        list.remove(list.size()-1); //remove the element that you just added in list  in line no 21
        PrintAllSubsequences(index+1,arr,list);
    }
}
