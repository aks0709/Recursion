public class MltipleRecursiveCalls
{
    public static void main(String[] args) {
        int ans=fibonnaci(6);
        System.out.println(ans);
    }
    static int fibonnaci(int n)
    {
        if(n==1)
            return 1;
        if(n==0)
            return 0;

        return (fibonnaci(n-1)+fibonnaci(n-2));
    }
}
