import java.util.Scanner;
class Even
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("not even number");
		}
	}
}
