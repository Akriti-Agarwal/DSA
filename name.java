import java.util.Scanner;
class name 
{
    public void display(int i,int n)
            {
            if(i>n)
                return;
            System.out.println("Akriti");
            display(i+1,n);
            }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the n");   
            int n = sc.nextInt();
            sc.close();
            name obj = new name();
            obj.display(1,n);
    }
}