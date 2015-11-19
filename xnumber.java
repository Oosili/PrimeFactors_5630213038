
package number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class xnumber {
public static void main(String args[]) throws IOException
{
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
int number;
do{
System.out.print("Enter Number : ");
number=Integer.parseInt(read.readLine());
System.out.print("Prime Factors Number "+ number +" is : ");
int i=2;
do{
   if(number%i == 0)
    {
     System.out.print(i+ "  ");
      number=number/i;
    }
   else
    i++;
  }while(number>1);
System.out.println();
}while(number!=0);
System.out.println("num = 0 ()exitloop");
}
}
