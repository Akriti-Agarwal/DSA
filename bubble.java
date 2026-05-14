import java.util.Scanner;
class bubble
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a[]= new int [6];
        System.out.println("enter the elemenents of the array");
        for(int i=0;i<6;i++)
        {
            a[i]=sc.nextInt();  
        } 
        sc.close();
        for(int i=5;i>=1;i--)
        { 
            for(int j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        for(int i =0;i<6;i++)
            {
                System.out.println(a[i]);
            }
        

    }
}