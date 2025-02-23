class Shift_rightsecond
{
	public static void main(String[] args) 
	{
		char a[]={'a','b','c','d','e','f'};
		int last=a[(a.length)-1];
		for(int i=(a.length)-1;i>((a.length)/2);i--)
		{
		    a[i]=a[i-1];
		}
		a[(a.length)/2]=last;
		
        System.out.print("a={");
		for(int i:a)
		{
			System.out.print(i+",");
		}
		    System.out.println("}");
	}
		
}
