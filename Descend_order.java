class Descend_order 
{
	public static void main(String[] args) 
	{
		int a[]={8,2,7,12,6,15};
		for(int i=(a.length/2);i<=(a.length)-1;i++)
		   {
			 for(int j=(a.length/2);j<(a.length)-1;j++)
			  {
				if(a[j]<a[j+1])
				{
					int c=a[j];
					a[j]=a[j+1];
					a[j+1]=c;
				}
			  }
		   }

		System.out.print("a={");
		for(int i:a)
		{
			System.out.print(i+",");
		}
		System.out.println("}");

	}
}


	


