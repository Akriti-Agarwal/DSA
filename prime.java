class prime
{
    public static void main(String args[])
    {
        prime obj = new prime();
        obj.check(17);
    }
    public void check(int n)
    {
        int c=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            c=c+1;
        }
    }        
    
    if(c==2)
    {
        System.out.println("prime");
    }
    else
    {
        System.out.println("not prime");
    }
}
}