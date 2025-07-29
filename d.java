 import java .util.Scanner;
 class d
  {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int l,d=0,i,t=0;
        System.out.println("enter the length");
        l=sc.nextInt();
        int a[]=new int[l];
        int s[]= new int[l];
        System.out.println("enter the value of d");
        d=sc.nextInt();
        for(int m=0;m<l;m++)
        {
            a[m]=sc.nextInt();
        }
        for(i=0;i<l-d;i++)
       {
          s[i]=a[d+i];
       }
       for(i=l-d;i<l;i++)
       {
       s[i]=a[t];
        t++;
       }

       for(int f=0;f<l;f++)
       {
        System.out.print(s[f]);
       
       }

    }
    
}
