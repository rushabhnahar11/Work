import java.io.*;
import java.util.*;
class pattern1
{
	public static void main(String cd[])
	{
		Scanner s=new Scanner(System.in);
		int [][]a=new int[5][5];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==1 && j>2 || i==2 && j<2)
					System.out.print(" ");
				else
					System.out.print("*");
			}
				System.out.print("\n");
		}
	}	
}
	