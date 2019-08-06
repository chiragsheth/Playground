import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      int arr[ ] = new int  [ n ]; 
      for (int idx=0;idx <n;idx++){
        arr [idx]=in.nextInt ();}
      substitute (arr,n);
      
    }
  public static void substitute  (int arr [],int n)
  {
    for (int idx1=0;idx1 <n-1;idx1++)
    {
      for (int idx2=idx1+1;idx2 <n;idx2++)
      {
        for (int idx3=idx2+1;idx3 <n;idx3++)
        {
          System.out.print("("+arr [idx1]+", "+arr [idx2]+", "+arr [idx3]+") ");
        }
      }
      System.out.println  ();
    }
  }
}