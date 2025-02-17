class Shift_right 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5,6};
		int last=a[((a.length)/2)-1];
		for(int i=((a.length)/2)-1;i>0;i--)
		{
		    a[i]=a[i-1];
		}
		a[0]=last;
		
        System.out.print("a={");
		for(int i:a)
		{
			System.out.print(i+",");
		}
		    System.out.println("}");
	}
		
	
}
