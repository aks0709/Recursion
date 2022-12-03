import java.util.ArrayList;

public class SubsequencesTUFL7
{
    public static void main(String[] args) {

        int arr[]={3,1,2};
        int TargetSum=3;
        PrintAllSubsequences(0,arr,new ArrayList<>(),TargetSum,0);
    }
    static void PrintAllSubsequences(int index,int arr[], ArrayList<Integer> list,int sum,int s)
    {
        if(index>= arr.length)
        {
            if(s==sum) {
                System.out.print(list + "  ");
            }
            return;
        }

        //take it
        list.add(arr[index]);
        sum=sum+arr[index];
        PrintAllSubsequences(index+1,arr,list,sum,s);
        //leave it
        list.remove(list.size()-1); //remove the element that you just added in list  in line no 21
        sum=sum-arr[index];
        PrintAllSubsequences(index+1,arr,list,sum,s);
    }
}
