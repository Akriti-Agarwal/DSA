import java.util.Scanner;
class divisors
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        divisors obj = new divisors();
        obj.findDivisors(n);
    }
    public void findDivisors(int n)
    {
        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
        
    }
};