import java.util.Scanner;
class Main{
  public static int compare (int a,int b)
  {
       if (a>b)
         return a;
    else
      return b;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n1= in.nextInt ( ); 
      int n2= in.nextInt ( ); 
      int n3 = in.nextInt ( ); 
      int compare1=compare (n1,n2);
      int compare2=compare (compare1,n3);
      System.out.println(compare2);
      
	}
}