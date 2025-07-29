import java.util.*;
public class summ 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,s,largest=0,z,t;
        int a[]=new int [10];
        System.out.println("enter the number target");
        t=sc.nextInt();
        System.out.println("enter the values");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<10;i++)
        {
           s=0;
            for(j=i;j<10;j++)
            { 
                s=s+a[j];
                if(s==t)
                {
                    z=j-i+1;
                   
                    
            
            if(z>largest)
            {
                largest=z;

            }
            break;
        }
        }
    }
        System.out.println("the longest substring is ="+largest);
    }
    
}
