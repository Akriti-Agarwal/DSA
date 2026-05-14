import java.util.Scanner;
class backtrack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the n");   
            int n = sc.nextInt();
            sc.close();
            backtrack obj = new backtrack();
            obj.display(1,n);
    }
    public void display(int i, int n)
    {
        if(i<1)
            return;
        display(i+1,n);
        System.out.print(i); 
        
    }
}