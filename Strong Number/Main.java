import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      int n2=n;
      int n1;
      int sum=0;
      while (n>0)
      {
        n1=n%10;
        n=n/10;
        int fact=1;
        for (int count=1;count <=n1;count++)
          fact=fact*count;
        sum=sum+fact;
      }
      if (sum==n2)
        System.out.println ( "Yes");
      else
        System.out.println ( "No");
	}
}