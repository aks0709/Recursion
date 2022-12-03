public class BasicRecursionProblemsTUF3
{
    public static void main(String[] args) {

        System.out.println(SumOFNnumbers(5));  //functional way
        SumOfNNumbers2(5,0);  //parameterised way
        System.out.println(fact(5));  //functional way
        fact2(5,1);//parameterised way
    }
    static int SumOFNnumbers(int n)
    {
        if(n==0)
            return 0;

        return n+SumOFNnumbers(n-1);
    }
    static  void SumOfNNumbers2(int i,int n)
    {
        if(i<0)
        {
            System.out.println(n);
            return;
        }

        SumOfNNumbers2(i-1,n+i);
    }
    static  int fact(int n)
    {
        if(n==1||n==0)
            return 1;

        return n*fact(n-1);
    }
    static void fact2(int i,int n)
    {
        if(i<1)
        {
            System.out.println(n);
            return;
        }

        fact2(i-1,n*i);

    }
}
