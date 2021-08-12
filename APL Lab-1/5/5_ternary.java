class _5_ternary
{
    public static void main(String args[])
    {
        int a=1,b=2,c=3,d=4;

        int max = (a>b && a>c && a>d)? a : ((b>c && b>d)? b : (c>d)? c:d);

        int min = (a<b && a<c && a<d)? a : ((b<c && b<d)? b : (c<d)? c:d);

        System.out.println("Max =" +max);
        System.out.println("Min =" +min);
    }
}