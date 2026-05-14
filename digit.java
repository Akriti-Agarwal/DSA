import java.util.Scanner;
class digit {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        digit obj= new digit();
        obj.countDigit(n);
    }
        public int countDigit(int n)
        {
        int t=0;
        while(n>0)
        {
            t=t+1;
            n=n/10;
        }
        System.out.println(t);
        return t;
    }

}
