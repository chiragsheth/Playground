import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      int arr[]=new int [n];
      int max=0;
      for (int idx=0;idx <n;idx++)
      {
           arr [idx]=in.nextInt ();
      }
      if (arr [0]>arr [1])
        max=arr [0];
      else
        max=arr [1];
      for (int idx=2;idx <n;idx++)
      {
        if (max <arr [idx])
          max=arr [idx];
      }
      System.out.println  (max);
    }
}