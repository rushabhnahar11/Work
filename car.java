import java.io.*;

class car

{

          static int ctr=0;

          static int ctr_tax=0; 

          car()

          {
                    ctr++;
          }

          void tax(int a)

          {
                    if(a==1)

                    ctr_tax++;
          }

          }

          class booth

          {
 
          public static void main(String arg[])

          {

          DataInputStream ins=new DataInputStream(System.in);

          int ans=1,ncar=5;

          do

          {
          car c=new car();

          try

          {

          System.out.print("Press 1 if u want to pay tax ");

          ans=Integer.parseInt(ins.readLine());

          c.tax(ans);

          System.out.print("Another car? Press 5 ");

          ncar=Integer.parseInt(ins.readLine());

          }

          catch(IOException e)

          { }

          } while(ncar==5);

          System.out.println("Total no. of cars passed by: "+car.ctr);

          int non=car.ctr-car.ctr_tax;

          System.out.println("No. of cars which have not paid tax: "+non); 

          int amt=car.ctr_tax*50;

          System.out.println("Amount of cash collected: "+amt);

          }
}

