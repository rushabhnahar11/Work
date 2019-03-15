
import java.util.Scanner;

class prime{
	public static void main(String cd[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number from 1 to ");
		
		int n=s.nextInt();
		
		int cnt=0;
		
		for(int i=2;i<=n;i++)
		{
			cnt=0;
			for(int j=1;j<=i;j++)
			{				
					if(i%j==0)
					{
						cnt++;
					}				
			}
			if(cnt==2)
			{
				System.out.println(i+" ");
			}
		}
	}
}
