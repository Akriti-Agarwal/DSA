import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,max=0,s=0,j,t,l=0,z=0;
        
        t=10;

        int a[]=new int [10];
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            z=l;
          
            s=s+a[i];
            if(s==t)
            {
                
                s=0;
                l=i+1;
             
                if(l>max)
                {
                    max=l;
                }
            }
        }
        System.out.println(max-z);
        
                }

            }

        
    

