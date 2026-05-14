import java.util.Scanner;
class reversal
{
    public int rev(int n , int d)
    {
         if(n<1)
         {
            return d ;
         }
        int r = n%10;
         return rev(n/10, d*10 + r);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        sc.close();
        reversal obj = new reversal();
        System.out.println(obj.rev(n,0));
    }
}