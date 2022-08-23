public class Palindrome
{
    public static void main(String[] args)
    {
     String str="abccba";
     char ch[]=str.toCharArray();

     String str2=ReverseString(ch,0,str.length()-1);
        System.out.println(str);
     System.out.println(str2);
     int comparison=str.compareTo(str2);
     if (comparison==0)
         System.out.println("Strings are equal");
     else System.out.println("Strings are not equal");
    }

    static String ReverseString(char ch[],int start,int end){

        if (start>end)
            return "null";
        System.out.println("--");
        System.out.println(ch);
        System.out.println("--");
        ReverseString(ch, start + 1, end - 1);
        char s = ch[start];
        ch[start] = ch[end];
        ch[end] = s;

        String S=String.copyValueOf(ch);
        return S;
    }
}
