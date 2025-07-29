import java.util.*;
class solution
{
    public static void main(String args[])

{
    int l,i,j=0;
   
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the length");
    l=sc.nextInt();
    int []s= new int[l];
    int a[]=new int[l];
    for(i=0;i<l;i++)
    {
        a[i]=sc.nextInt();

    }
       for(i=0;i<l-1;i++)
       {
        if(a[i]!=a[i+1])
        {
        s[j++]=a[i];
       }
    }
    s[j++]=a[l-1];
    for(i=0;i<j;i++)
    {
        a[i]=s[i];
    }
    for(i=0;i<j;i++)
    {
        System.out.println(a[i]);
    }
}
}


