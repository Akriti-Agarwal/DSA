import java.util.*;
class suma
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,t=5,s=0,z=0;
        int a[]=new int [10];
        System.out.println("Enter the nos");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                s=a[i]+a[j];
                if(s==t)
                {
                 z=1;
                }
                

            }
        }
        if(z==1)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
            
        

    }
}