import java.util.Scanner;
import java.util.HashMap;
class hashmap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the hash map:");
        int size = sc.nextInt();
        
        int[] a = new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++)
        {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int q;
        System.out.println("Enter the number of queries:");
        q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x;
            System.out.println("Enter the number to query:");
            x = sc.nextInt();
            System.out.println("The frequency of "+x+" is: "+map.getOrDefault(x, 0));


        }
        sc.close();
    }
    
} 
