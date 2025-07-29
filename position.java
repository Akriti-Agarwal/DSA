public class position {
    public static void main(String args[])
    {
        int i,j,c;
        int a[]={1,-2,3,4,5,-5,-3,-4,-2,9};
        for(i=0;i<9;)
        {
            
                if(a[i]>0)
                {
                    if(a[i+1]>0)
                    {
                        for(j=i;j<10;j++)
                        {
                            if(a[j]<0)
                            {
                                c=a[j];
                                a[j]=a[i+1];
                                a[i+1]=c;
                                break;
                            }
                        }

                    }
                }
                else 
                {
                    if(a[i+1]<0)
                    {
                        for(j=i;j<10;j++)
                        {
                            if(a[j]>0)
                            {
                                c=a[j];
                                a[i+1]=a[j];
                                a[j]=c;
                                break;
                            }
                        }
                    }
                }
                i=i+2;
            }
        

    
        
        for(i=0;i<10;i++)
        {
            System.out.print(a[i]);
        }
    }
}
    

