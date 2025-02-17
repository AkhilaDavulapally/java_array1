import java.util.Scanner;
class Array_2d_char
{
  public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subarrays");
		int i=sc.nextInt();
		System.out.println("Enter how many elements to store");
        int j=sc.nextInt();
		char a[][]=new char[i][j];
		for(int z=0;z<=(a.length)-1;z++)
		{
			for(int y=0;y<=(a[z].length)-1;y++)
			{
				System.out.println("enter the"+(z+1)+ "array"+(y+1)+"values");
				char value=sc.next().charAt(0);
				a[y][z]=value;

			}
		}
		
		for(int z=0;z<=(a.length)-1;z++)
		{
			System.out.print("{");
		    for(int y=0;y<=(a[z].length)-1;y++)
			{
			  System.out.print(a[z][y]+",");
			}
			 System.out.println("}");
		}
	}
}

