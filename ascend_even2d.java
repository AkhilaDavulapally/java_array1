class ascend_even2d
{

	public static void main(String[] args) 
	{
		int a[][]={{10,5,12},{15,30,18},{20,15,6}};
		
	    for(int i=0;i<=(a.length)-1;i++)
		{  
			if(i%2==0)
			{
             for(int j=0;j<(a[i].length)-1;j++)
				{
				 for(int k=0;k<(a[i].length)-1;k++)
					{
					 if(a[i][k]>a[i][k+1])
						{
						 int c=a[i][k];
						 a[i][k]=a[i][k+1];
						 a[i][k+1]=c;
						}
					}
				}
			}
		}
         for(int i=0;i<=(a.length)-1;i++)
		   {
			System.out.print("{");
		    for(int j=0;j<=(a[i].length)-1;j++)
			{
			  System.out.print(a[i][j]+",");
			}
			 System.out.println("}");
		   }
		
	
	
	} 
}                 