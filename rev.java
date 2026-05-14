import java.util.Scanner;
class rev
{
    public void print(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the n");   
            int n = sc.nextInt();
            sc.close();
            rev obj = new rev();
            obj.print(n);
    }
}