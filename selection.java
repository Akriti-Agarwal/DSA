import java.util.Scanner;
class selection
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("enter the array element");  
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close(); 
        for(int i =0;i<=3;i++)
        {
            int min=i;
            for(int j=i;j<=4;j++)
            {
                if(a[j]<a[i])
                {
                    min=j;
                }
            
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }   
    }
}