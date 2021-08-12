class _3_cr 
{
    static void circle(int r)
    {
        System.out.println((22*r*r)/7);
    }

    _3_cr(int l,int b)
    {
        System.out.println(l*b);
    }

    public static void main(String args[])
    {
        int r=5;
        int l=4,b=3;

        circle(r);

        _3_cr obj = new _3_cr(l,b);
    }
}