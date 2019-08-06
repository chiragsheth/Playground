import java.util.Scanner;
class Main{
  public static int sum_of_no (int m)
  {
    int sum_1=0;
      for (int count=1;count <=m;count++)
      {
        sum_1=sum_1+count;
      }
    return sum_1;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      int sum=sum_of_no (n);
        System.out.println(sum);
	}
}