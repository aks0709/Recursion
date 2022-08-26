public class DeleteDuplicates
{
    public static void main(String[] args)
    {
        String input="abbcca";
        System.out.println(removeConsecutiveDuplicates(input));
    }

    static String removeConsecutiveDuplicates(String input)
    {
        if (input.length()<=1)
            return input;

        if (input.charAt(0)==input.charAt(1))
            return removeConsecutiveDuplicates(input.substring(1));
        else
            return input.charAt(0)+ removeConsecutiveDuplicates(input.substring(1));

    }
}
