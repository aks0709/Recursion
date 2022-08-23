public class ReverseString
{
    public static void main(String[] args)
    {
        String str="ayush";
        char ch[]=str.toCharArray();

        int start=0;
        int end=str.length()-1;

        reversestring(ch,start,end);
        System.out.println(ch);
    }

    static void reversestring(char ch[],int start,int end){
        //System.out.println("call recieved");
        //System.out.println(ch);


        if (start>end)
            return;

        reversestring(ch,start+1,end-1);
        char C=ch[start];
        ch[start]=ch[end];
        ch[end]=C;
    }
}
