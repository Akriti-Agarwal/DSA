public class set {
    public static void main(String srgs[])
    {
        int i,j,x=0,y=0;
        int a[][]={{1,0,1,1},{2,1,0,1},{1,1,1,1}};
        for(i=0;i<3;i++)
    {
            for(j=0;j<4;j++)
            {
                if(a[i][j]==0)
                {
                    x=i;
                    y=j;
                }
                
            
        
            for(i=0;i<3;i++)
            {
        
            for(j=0;j<4;j++)
            {
                if(i==x || j==y)
                {
                    a[i][j]=0;
                }
            }
        }
    }
            
        
            
    }
    for(i=0;i<3;i++)
    {
        for(j=0;j<4;j++)
        {
            System.out.print(a[i][j]);
        }
        System.out.println();
    }
    }
    
}
