import java.util.*;

class palindrone
{
	public static void main(String ss[])
	{
		int a=0,b=0,c=1;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  no :");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++){
			a=b;
			b=c;
			c=a+b;
			
			System.out.println("palindrone no :"+a);
		}
	}
}
		
		