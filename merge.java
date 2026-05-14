import java.util.Scanner;
class merge
{
    public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    int a[]= new int [5];
    System.out.println("enter the numbers");
    for(int i=0;i<5;i++)
    {
        a[i]=sc.nextInt();
    }
    sc.close();
    merge m = new merge();
    m.mergesort(a, 0, 4);
    for(int i=0;i<5;i++)
    {
        System.out.println(a[i]);
    }
}
    public void mergesort(int a[], int low , int high)
    {
        if(low>=high)
            return;
            int mid=(low+high)/2;
            mergesort(a, low, mid);
            mergesort(a, mid+1, high);
            merge(a, low, mid, high);
        
    }
    public void merge(int a[], int low, int mid, int high)
    {
        int k=0;
        int left= low;
        int right =mid+1;
        int temp[] = new int [high-low+1];
        while(left <=mid && right<=high)
        {
            if(a[left]<a[right])
            {
                temp[k++]=a[left];
                left++;
            }
            else
            {
                temp[k++]=a[right];
                right++;
            }
        }
        while(left<=mid)
        {
            temp[k++]=a[left++];
        }
        while(right<=high)
        {
            temp[k++]=a[right++];
        }
         for(int i=low;i<=high;i++)
        {
        a[i]=temp[i-low];
        }
}

}
