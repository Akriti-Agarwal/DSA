 class ion{
    public static void main(String args[])
    {
        int i;
        int a[]={1,2,3,4,5};
        int s[]=new int[5];
        for(i=0;i<4;i++)
        {
            s[i]=a[i+1];
        }
        s[4]=a[0];
        for(i=0;i<5;i++)
        {
            System.out.print(s[i]);

        }

    }
}
