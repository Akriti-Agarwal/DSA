public class double_pyramid
{
    public static void main(String args[])
    {
        int i, j;
    for(i=5;i>0;i--)
    {
        for(j=5;j>i;j--)      
    {
            System.out.print(" ");  
        }
        for(j=2*i-1;j>0;j--)
        {
            System.out.print("*");  
        }
        for(j=5;j>i;j--)      
              {
            System.out.print(" ");  
        }
        System.out.println();
    }
    for(i=0;i<5;i++)
    {
        for(j=0;j<5-i-1;j++)      
              {
            System.out.print(" ");  
        }
        for(j=0;j<=2*i+1;j++)
        {
            System.out.print("*");  
        }
        for(j=0;j<5-i-1;j++)      
              {
            System.out.print(" ");  
        }
        System.out.println();
    }
}

}

