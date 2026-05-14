import java.util.Scanner;
class fibonacci
{
    public int fib(int n)
    {
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        sc.close();
        fibonacci obj = new fibonacci();
        System.out.println("The " + n + "th Fibonacci number is: " + obj.fib(n));
    }
}