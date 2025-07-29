import java.util.*;
class once
{
    public static main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i;
        int a[]= new int [3];
        System.out.println("enter the nos");
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        int hash[]=new int [3];
        for(i=0;i<4;i++)
        {
            hash[a[i]]++;


        }
        for(i=0;i<4;i++)
        {
            if(hash[a[i]]==1)
            {
                return a[i];
            }
        }
    }
}