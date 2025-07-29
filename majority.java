import java.util.*;
public class majority {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int largest=0;
        int i;
        int a[]=new int [10];
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
        }
        int l[]= new int [10];
        
        for(i=0;i<10;i++)
        {
           l[a[i]]=l[a[i]]+1;
        }
        for(i=0;i<10;i++)
        {
            
        
        if(l[i]>5)
        {
            System.out.print(i);

        }
        }

    }
    
    
}
