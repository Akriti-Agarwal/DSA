import java.util.Scanner;
class insertion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a[]= new int [5];
        System.out.println("enter the numbers");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        
        }
        sc.close();
        for(int i=1;i<5;i++)
        {
            int swap=0;
            for(int j=i;j>0;j--)
            {

            if(a[j]<a[j-1])
            {
                int temp = a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                swap=1;
            }
        
        if(swap==0)
        {
            break;
        }
    }

        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
            }

    }
}