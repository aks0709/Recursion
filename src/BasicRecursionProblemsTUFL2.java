public class BasicRecursionProblemsTUFL2
{
    public static void main(String[] args)
    {
        Print1toN(1,4);
        System.out.print("\n");
        PrintNto1(4,4);
        System.out.print("\n");
        BackTrack1toN(4,4);
        System.out.print("\n");
        BackTrackNto1(1,4);




    }
    public static void Print1toN(int i,int N)
    {
        if (i>N) {
            return;
        }

        System.out.print(i+" ");
        Print1toN(i+1,N);
    }
    public static void PrintNto1(int i,int N)
    {
        if (i<1)
            return;

        System.out.print(i+" ");
        PrintNto1(i-1,N);
    }
    public static void BackTrack1toN(int i,int N)
    {
        if(i<1)
            return;

        BackTrack1toN(i-1,N);
        System.out.print(i+" ");
    }

    public static void BackTrackNto1(int i,int N)
    {
        if(i>N) {
            return;
        }
        BackTrack1toN(i+1,N);
        System.out.println(i);
    }
}
