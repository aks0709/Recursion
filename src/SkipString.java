public class SkipString
{
    public static void main(String[] args)
    {

        System.out.println(Skip("abapplec"));
    }

    static String Skip(String unprocessed)
    {
        if (unprocessed.isEmpty())
            return "";

        if (unprocessed.startsWith("apple"))
            return Skip(unprocessed.substring(5));
        else
            return unprocessed.charAt(0)+Skip(unprocessed.substring(1));
    }
}
