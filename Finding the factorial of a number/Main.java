import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
     int f=1;
    factorial(n,f);
  }
  
  public static void factorial(int n,int f)
  {
    
    if(n==0)
    {
      System.out.print(f);
      return;
    }
     f=f*n;
    factorial(n-1,f);
  }
}