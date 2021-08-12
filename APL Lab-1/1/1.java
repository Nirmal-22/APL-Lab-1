class _1
{
    static int add(int a,int b) {return a+b;}

    static int minus(int a,int b) {return a-b;}

    static int product(int a,int b) {return a*b;}

    static double divide(int a,int b) {return a/b;}

    static int mod(int a,int b) {return a%b;}

    
    static boolean and(boolean x,boolean y) { return x&&y;}

    static boolean or(boolean x,boolean y) {return x||y;}

    static boolean not(boolean x) {return !x;}


    public static void main(String args[])
    {
        int a=4,b=5;

        System.out.println(a+ "+" + b + "=" + add(a,b) );
        System.out.println(a+ "-" + b + "=" + minus(a,b));
        System.out.println(a+ "*" + b + "=" + product(a,b));
        System.out.println(a+ "/" + b + "=" + divide(a,b));
        System.out.println(a+ "%" + b + "=" + mod(a,b));

        boolean x=true,y=false;

        System.out.println(x + "&&" + y + "=" + and(x,y));
        System.out.println(x + "||" + y + "=" + or(x,y));
        System.out.println("!" + x + "=" + not(x));
        System.out.println("!" + y + "=" + not(y));
    }
}