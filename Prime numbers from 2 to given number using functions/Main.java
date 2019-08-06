import java.util.Scanner;
class Main{
  public static int prime_no (int m)
  {
    int count=0;
    for (int num1=1;num1 <=m;num1++)
    {
     if (m%num1==0)
       count++;
    }
    if (count==2)
      return m;
    else return 0;
   
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      for (int num=2;num <=n;num++)
      {
        int prime=prime_no (num);
        if (prime==0)
          System.out.print("");
        else
           System.out.println(prime);
      }
	}
}