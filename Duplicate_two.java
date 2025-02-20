class  Duplicate_two
{
	public static void main(String[] args) 
	{
		
		int a[]={1,2,3,4,5};
		int b[]={7,5,3,9,1};
	
	    for(int i=0;i<=(a.length)-1;i++)
		   {
	
			 for(int j=0;j<=(b.length)-1;j++)
			  {
				if(a[i]==b[j])
				{
					
				  System.out.println(a[i]);
				  break;
				}
			  }
		   }
		   
	}
}
		   