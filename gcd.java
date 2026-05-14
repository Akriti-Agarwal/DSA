class gcd
{
    public static void main(String args[])
    {
        gcd obj = new gcd();
        obj.find(64, 16);
    }
    public int find(int a,int b)
    {
        int gcd = 0;
        for(int i = 1;i <=a && i<=b; i++)
        {
            if(a%i==0 && b%i==0)
            {
                
                    gcd = i;
                
            }
        }
        System.out.println("gcd is " + gcd);
        return gcd;

    }
}