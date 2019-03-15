import java.util.*;

class PrimeUpto
{
	public static void main(String args[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Number");
			int n=s.nextInt();
			
			for(int i=2;i<=n;i++)
			{
				int cnt=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						cnt++;
					}
				}
				if(cnt==2)
				{
					System.out.print(i+" ");
				}
			}		
	}
}