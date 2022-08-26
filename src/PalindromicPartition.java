import java.util.ArrayList;

public class PalindromicPartition
{
    public static void main(String[] args)
    {
        String str="maddam";
        ArrayList<String> list=new ArrayList<>();
        System.out.println(allPalindromicPartitions(str,0,str.length()-1,list));

        PalindromicPartitionsprinting(str,0,str.length()-1);

    }
    //approach is take every substring starting from first character and check if it is palindrome if yes then add in the solution and reccur for remaining part
    static ArrayList<String> allPalindromicPartitions(String str, int start,int end,ArrayList<String> list)
    {
        if (start==end)
        {
            return list;
        }

        for (end=start;end<=str.length();end++)
        {
            if (isPalindrome(str.substring(start,end),0,str.substring(start,end).length()-1))
                list.add(str.substring(start,end));
        }

        return allPalindromicPartitions(str,start+1,end,list);

    }
    //printing of the possible palindromes out of string
    static void PalindromicPartitionsprinting(String str, int start,int end)
    {
        if (start==end)
        {
            return;
        }

        for (end=start;end<=str.length();end++)
        {
            if (isPalindrome(str.substring(start,end),0,str.substring(start,end).length()-1))
                System.out.println(str.substring(start,end));
        }

        PalindromicPartitionsprinting(str,start+1,end);

    }
    static boolean isPalindrome(String str,int start,int end)
    {

        if (start>end)
            return true;

        if (str.charAt(start)!=str.charAt(end))
        {
            return false;
        }

        return isPalindrome(str,start+1,end-1);
    }
}
