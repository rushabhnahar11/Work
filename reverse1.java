import java.util.*;
class reverse1
{
	int i;
	public static void main(String args[])
	{
		String str;
		String reverse="";
		Scanner s =new Scanner(System.in);
		str=s.nextLine();
		
		
		for (int i=str.length()-1;i>=0;i--)
		{
			 reverse=reverse+str.charAt(i);
		}
		System.out.println("String Reverse");
		System.out.println(reverse);
	}
}