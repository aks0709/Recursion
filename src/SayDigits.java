public class SayDigits
{
    public static void main(String[] args) {
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n=412;
        say_digits(n,arr);
    }
    static  void say_digits(int n,String arr[]){
        //base case
        if (n==0)
            return;

        //processing
        int digit=n%10;
        n=n/10;

        say_digits(n,arr);

        System.out.println(arr[digit]);
    }
}
