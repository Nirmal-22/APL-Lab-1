class _6
{
    public static void main(String args[])
    {
        int z=8;
        int a =  z++ + ++z; //18 10
        int b = z-- + --z;  //18 8
        int c = z++;  //8 9
        int d = ++z;  //10 10 
        int e = z--;  //10 9
        int f =  --z;  //8 8 

        System.out.print(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
    }
}