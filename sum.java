import java.util.Scanner;
class sum
{
    
    public void add (int i, int d)
    {
        if(i < 1)
        {
            System.out.println("The sum is "+d);
            return ;
        }
        add(i-1, d+i);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();   
        sc.close();
        sum obj = new sum();
        int d=0;
        obj.add(n,0);
        
    }
}