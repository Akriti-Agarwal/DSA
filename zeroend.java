class zero
{
    public static void main(String args[])
    {   
        int i,j=0;
        int []s= new int[10];
        int a[]={1,0,4,2,0,0,0,4,2,3};
        for(i=0;i<10;i++)
        {
            if(a[i]!=0)
            {
                s[j++]=a[i];
            }
        }
        for(int k=0;k<10;k++)
        {
            System.out.print(s[k]);
        }


        
    }
}