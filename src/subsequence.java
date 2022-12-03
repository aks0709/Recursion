public class subsequence
{
    public static void main(String[] args)
    {

        String str="abc";
        SubSequence("",str);

    }

    static void SubSequence(String P,String up)
    {

        if (up.isEmpty()) {
            System.out.print(P+" ");
            return;
        }
        char ch=up.charAt(0);
        //takeit
        SubSequence(P+ch,up.substring(1));
        //ignore it
        SubSequence(P,up.substring(1));
    }
}
