import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class GreaterNo {
	public static void main(String args[]){
		
		int n,max;
		Scanner s=new Scanner(System.in);
		
		n=s.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter Element In array");
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		
		
		for(int i=0;i<n;i++)
		{
			if(max >a[i])
			{

				max=a[i];
			}
			
		}
		System.out.println("MIN number in array"+max);
	}
}
