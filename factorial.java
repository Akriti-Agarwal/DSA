import java.util.Scanner;
class factorial
{
    public int fact (int n)
    {
        if(n==0)
            return 1;
        return n * fact(n-1);
    }
      public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n");
        int n=sc.nextInt();
        sc.close();
        factorial obj= new factorial();
        System.out.println("The factorial of " + n + " is: " + obj.fact(n));
      }
}