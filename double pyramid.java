public class double pyramid
{
    public void main()
    {
        int i, j;
    for(i=5;i>0;i++)
    {
        for(j=i;j>5;j++)      
              {
            System.out.print(" ");  
        }
        for(j=2*i-1;j>=0;j--)
        {
            System.out.print("*");  
        }
        for(j=i;j>5;j++)      
              {
            System.out.print(" ");  
        }
    }
    for(i=0;i<5;i++)
    {
        for(j=i;j>5-i-1;j++)      
              {
            System.out.print(" ");  
        }
        for(j=2*i-1;j>=0;j--)
        {
            System.out.print("*");  
        }
        for(j=i;j>5-i-1;j++)      
              {
            System.out.print(" ");  
        }
    }
}

}
