import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      int arr [ ] = new int [ n ]; 
      for (int idx=0;idx <n;idx++){
        arr [idx]=in.nextInt ();}
      int n1 = in.nextInt ( ); 
      substitute(n,arr,n1);
      
    }
  public static void substitute (int n,int arr [],int n1)
  {
    for (int idx1=0;idx1 <n;idx1++)
    {
      for (int idx2=idx1+1;idx2 <n;idx2++)
      {
       if (arr [idx1]+arr [idx2]==n1)
        {
          System.out.println(arr [idx1]+", "+arr [idx2]);
        }
      }
      
    }
  }
}