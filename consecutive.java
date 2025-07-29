public class consecutive
 {
    public static void main(String args[])
    {
        int i,t=0;
        int a[]={1,2,3,0,9,8,6,7,8,9};
        for(i=0;i<9;i++)
        {
            
            if(a[i+1]==a[i]+1)
            {
                t++;
            }
           
            else
            {
                t=0;
            }

        }
        System.out.println(t+1);
    }
    
}
