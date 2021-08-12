class addition
{

    int a,b,c,d,sum;

    addition(int p,int q)
    {
        this.a = p;
        this.b = q;

        sum=a+b;
    }

    addition(int p,int q,int r)
    {
        this.a = p;
        this.b = q;
        this.c = r;

        sum=a+b+c;
    }

    addition(int p,int q,int r,int s)
    {
        this.a = p;
        this.b = q;
        this.c = r;
        this.d = s;

        sum=a+b+c+d;
    }

    void sum()
    {
        System.out.println(sum);
    }


    public static void main(String args[])
    {
        addition obj1 = new addition(2,3);

        addition obj2 = new addition(2,3,4);

        addition obj3 = new addition(2,3,4,5);

        obj1.sum();
        obj2.sum();
        obj3.sum();
    }
}