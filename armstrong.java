import java.util.Scanner;
class armstrong
{
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        armstrong obj = new armstrong();
        obj.check(n);
    }
    public void check(int n)
    {
        int sum=0;
        int dup=n;
        while(n>0)
        {
        int r=n%10;
        sum= sum + r*r*r;
        n=n/10;
    }
    System.out.println(sum);
    if(sum==dup)
    {
        System.out.println("armstrong number");
    }
    else
    {
        System.out.println("not armstrong number");
    }
}
}