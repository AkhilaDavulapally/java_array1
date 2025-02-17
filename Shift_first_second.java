class Shift_first_second 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5,6,7,8};
		int half_first_last=a[((a.length)/2)-1];
		for(int i=((a.length)/2)-1;i>0;i--)
		{
		    a[i]=a[i-1];
		}
		a[0]=half_first_last;
		int last=a[(a.length)-1];
		for(int i=(a.length)/2;i>((a.length)-1);i--)
		{
		    a[i]=a[i+1];
		}
		a[(a.length)-1]=last;
		
        System.out.print("a={");
		for(int i:a)
		{
			System.out.print(i+",");
		}
		    System.out.println("}");
	}
		
	
}

