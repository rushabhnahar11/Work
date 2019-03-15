import java.util.*;

class AvgOfArray{
	public static void main(String args[])
	{
		int arr[]={2,5};
		int total=0;
		
		
		for(int i=0;i<arr.length;i++){
			total=total+arr[i];
		}
		int average=total/arr.length;
		
		System.out.println("Average"+average);
	}
}