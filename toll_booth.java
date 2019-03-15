import java.util.Scanner;
public class toll_booth {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Select Toll For vehical : ");
      System.out.println("A - Toll For Bus: ");
	  System.out.println("B - Toll For Truck : ");
	  System.out.println("C - Toll For Cars : ");
	  System.out.println("D - Toll For Bike : ");
	  System.out.println("E - Toll For Scooter : ");
      char ch = sc.next().charAt(0);
      switch(ch) 
	  {
         case 'A' :
		 
         System.out.println("Fare is 80");
         break;
		 
         case 'B' :
         System.out.println("Fare is Rs.80 ");
         break;
        
		 case 'C' :
         System.out.println("Fare is Rs.40 ");
         break;
		 
		 case 'D' :
         System.out.println("NO Fare Bike ");
         break;
		 
		 case 'E' :
         System.out.println("No Fare For Scooter ");
         break;
		 
         default :
         System.out.println("Invalid grade");
      }
   }
}