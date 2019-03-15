import java.util.*;


class reverse{
	public static void main(String args[])
	{
		String reversed="";
		String str="hello world";
		for (int i=str.length()-1;i>=0;i--)
		{
			reversed=reversed+str.charAt(i);
		}
		System.out.println("Reverse String is");
		System.out.println(reversed);
	}
}