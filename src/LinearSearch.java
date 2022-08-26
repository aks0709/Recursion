import java.util.ArrayList;

public class LinearSearch
{
    public static void main(String[] args) {
        int arr[]={4,2,3,1,4,4,5,8,9,5,4,3,4,2,4};
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(find(arr,4,0,list));
        System.out.println(list);

        System.out.println(find2(arr,4,0));
    }

    static ArrayList<Integer> find(int []arr,int target,int index,ArrayList<Integer> list)
    {
        if (index==arr.length)
        {
            return list;
        }
        if (arr[index]==target)
        {
            list.add(index);
        }
        return find(arr,target,index+1,list);
    }

    static ArrayList<Integer> find2(int []arr,int target,int index)
    {
        ArrayList <Integer> list =new ArrayList<>();
        if (index==arr.length)
        {
            return list;
        }
        if (arr[index]==target)
        {
            list.add(index);
        }
        ArrayList <Integer> ansfrombelowcalls=find2(arr,target,index+1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}
