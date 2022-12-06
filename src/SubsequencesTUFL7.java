import java.util.ArrayList;

public class SubsequencesTUFL7
{
    public static void main(String[] args) {

        int arr[]={3,1,2,1};
        int TargetSum=3;
        PrintAllSubsequences(0,arr,new ArrayList<>(),TargetSum,0);
        System.out.println("\n");
        PrintOnlyOneSubsequence(0,arr,new ArrayList<>(),TargetSum,0);
        int ans=CountNoOfSubsequencesWhichHaveSumK(0,arr,0,TargetSum);
        System.out.println("\n"+ans);
    }
    static void PrintAllSubsequences(int index,int arr[], ArrayList<Integer> list,int sum,int s)
    {
        if(index== arr.length)
        {
            if(sum==s) {
                System.out.print(list + "  ");
            }
            return;
        }

        //take it
        list.add(arr[index]);
        s=s+arr[index];

        PrintAllSubsequences(index+1,arr,list,sum,s);
        //leave it
        s=s-arr[index];
        list.remove(list.size()-1); //remove the element that you just added in list  in line no 21

        PrintAllSubsequences(index+1,arr,list,sum,s);
    }
    static boolean PrintOnlyOneSubsequence(int index,int arr[], ArrayList<Integer> list,int sum,int s)
    {
        if(index== arr.length)
        {
            if(sum==s) {
                System.out.print(list + "  ");
                return true;  //this condition hit we return true
            }
            else
            return false;  //else we return false
        }

        //take it
        list.add(arr[index]);
        s=s+arr[index];

        //if this condition return we simply return true no need to made further recursion calls
        if(PrintOnlyOneSubsequence(index+1,arr,list,sum,s)==true){
            return true;
        }
        //leave it
        s=s-arr[index];
        list.remove(list.size()-1); //remove the element that you just added in list  in line no 21

        //this recursive call only done if upper recursive calls didnt return true
        if(PrintOnlyOneSubsequence(index+1,arr,list,sum,s)==true)
            return true;

        return false;
    }

    static int CountNoOfSubsequencesWhichHaveSumK(int index,int arr[],int s,int sum)
    {
        //base condition
        if(index==arr.length)
        {
            if(s==sum)
            {
                return 1;
            }
            else
                return 0;
        }

        s=s+arr[index];
        int l=CountNoOfSubsequencesWhichHaveSumK(index+1,arr,s,sum);
        s=s-arr[index];
        int r=CountNoOfSubsequencesWhichHaveSumK(index+1,arr,s,sum);

        return l+r;
    }
}
