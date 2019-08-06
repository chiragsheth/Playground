import java.util.Scanner;
class Main
{
  public static int square_1 (int m)
  {
    int squr=m*m;
    return squr;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      int square= square_1 (n);
      System.out.println(square);
      
	} 
}