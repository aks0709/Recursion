public class CountWaysStairs
{
    public static void main(String[] args)
    {
    int n=5;
        System.out.println(countDistinctWaysToClimbStairs(n));
    }
    static int countDistinctWaysToClimbStairs(int nStairs)
    {//not the optimised solution because of TLE it can be optimised by Dyanamic Programing
     if(nStairs<0)//base case negative stairs are not possible
         return 0;
     if (nStairs==0)
         return 1;   //when you are at 0th stair and want to reach 0th stair no of way is 1

        //either you can take one step or two step at a time so logic is
        //F(N)=F(N-1)+F(N-2);
     int ans=countDistinctWaysToClimbStairs(nStairs-1)+countDistinctWaysToClimbStairs(nStairs-2);
     return ans;
    }
}
