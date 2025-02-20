class Evenly_Positioned_array
{
	public static void main(String[] args) 
	{
		int a[][]={{10,-5,12},{15,30,-18},{-20,15,6}};
		System.out.println("The given array is:");
		int count=0;
		for(int i=0;i<=(a.length)-1;i++)
		{
			System.out.print("{");
		    for(int j=0;j<=(a[i].length)-1;j++)
			{
			  System.out.print(a[i][j]+",");

			  count++;
			  if(count%2==0)
				{
				  System.out.println(count);
			    }
			 System.out.println("}");
			 System.out.println(count);
			}
		}
	}
}
             