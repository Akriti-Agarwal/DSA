import java.util.*;
public  class sub {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,largest=0,s=0;
        int a[]=new int [10];
        System.out.println("enter the nos");
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
                if(s>largest)
                {
                    largest=s;
                }
            }
        }
        System.out.println(largest);

    }
}


