public class Palindrome2
{
    public static void main(String[] args)
    {
    String str="ABBA";
    char ch[]=str.toCharArray();
    boolean ans=isPalindrome(ch,0,str.length()-1);
    if (ans)
        System.out.println("String is palindrome");
    else
        System.out.println("String is not palindrome");
    }

    static boolean isPalindrome(char ch[],int start,int end)
    {

        if (start>end)
            return true;

        if (ch[start]!=ch[end]){
            return false;
        }

        return isPalindrome(ch,start+1,end-1);
    }
}
