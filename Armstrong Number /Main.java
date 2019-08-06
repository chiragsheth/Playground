import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      int n1=n;
      int n2 =n;
      int count=0;
      int digit;
      int sum=0;
      while (n1>0)
      {
        n1=n1/10;
        count++;
      }
      while (n>0)
      {
        digit=n%10;
        n=n/10;
        sum=sum+ (digit*digit*digit);
      }
      if (sum==n2)
        System.out.println ( "Armstrong Number");
      else
        System.out.println ( "Not a Armstrong Number");
	}
}