public class back_pyramid 
{
    public static void main(String args[])
    {
        int i,j;
        for(i=4;i>0;i--)
        {
            for(j=1;j<=5-i;j++)
            {
            System.out.print(j);
        
            }
            for(j=2*(i-1);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=5-i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    
}
