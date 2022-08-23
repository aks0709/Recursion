public class ExponentialProblem
{
    public static void main(String[] args)
    {
        System.out.println("optimised code");
     int ans=power(3,10);
        System.out.println(ans);
        System.out.println("unoptimised code");
        int answer=OrderNMethod(2,10);
        System.out.println(answer);
    }

    //optimised solution using recursion
    static int power(int a,int b)
    {
        if (b==0)
            return 1;   //2^0=1
        if (b==1)
            return a;   //2^1=2

        int ans=power(a,b/2);
        //when power is even !
        if (b%2==0)
            return ans*ans;     //(a^b/2)*(a^b/2)
        else //when power is odd!
            return a*ans*ans;   //a*(a^b/2)*(a^b/2)
    }

    static int OrderNMethod(int a,int b){
        int ans=1;
        for (int i=1;i<=b;i++)
        {
            ans=ans*a;
        }
        return ans;
    }
}
