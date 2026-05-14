
import java.util.Scanner;
class arrayrev
{
    int a[];
    public void rev(int l,int r)
    {
        if(l>=r)
            return ;
        int temp = a[l];
        a[l] = a[r];    
        a[r] = temp;
        rev(l+1,r-1);
        }
        public static void main(String args[])
       {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        sc.close();
        arrayrev obj = new arrayrev();
        obj.a = a;
        obj.rev(0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(obj.a[i]+" ");
        System.out.println();
}
}