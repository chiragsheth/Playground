import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int s1=0;
      sum(n,s1);
    }
  
  public static void sum(int n,int s1)
  {
    if(n==0)
    {
      System.out.println(s1);
      return;
    }
    //return 0+sum(n-1);
    s1=s1+n;
    sum(n-1,s1);
  }
}