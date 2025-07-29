import java.util.*;
class 2sava
{
    public static void main(String args[])
    {
        int i,j,t=5;
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
                    System.out.print("yes");
                }
                else
                {
                    Sytem.out.print("no");
                }

            }
        }

    }
}