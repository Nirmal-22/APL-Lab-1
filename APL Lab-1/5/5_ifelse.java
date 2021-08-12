class _5_ifelse
{

    public static void main(String args[])
    {
        int a=1,b=2,c=3,d=4;

        System.out.print("Max = ");

        if(a>b && a>c && a>d)
        System.out.println(a);
        else if(b>c && b>d)
        System.out.println(b);
        else if(c>d)
        System.out.println(c);
        else
        System.out.println(d);




        System.out.print("Min = ");

        if(a<b && a<c && a<d)
        System.out.println(a);
        else if(b<c && b<d)
        System.out.println(b);
        else if(c<d)
        System.out.println(c);
        else
        System.out.println(d);
    }
}