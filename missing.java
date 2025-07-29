class missing {
    public static void main(String args[]) 
    {
        int i,temp,t,j=0;
        int nums[] ={ 9,8,7,5,4,3,2,1,0};
       
      for(i=0;i<nums.length-1;i++)
      {
        temp=nums[i];
        nums[i]=nums[i+1];
        nums[i+1]=temp;
      }
      for(i=0;i<nums.length;i++)
      {
        System.out.print(nums[i]);
      }
     
        for(i=0;i<nums.length;i++)
        {
            
            if(nums[i]==j)
            {
                j++;
            }
            else if(nums[i]!=j)
            {
                t=nums[i]+1;
                System.out.print(t);
                break;
            }


        }
        
    }
    
}