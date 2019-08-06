import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      int arr [ ] = new int [ n ]; 
      int list []=new int[n];
      int num=0;
      int count=0;
      for (int idx=0;idx <n;idx++)
        arr [idx]=in.nextInt ();
      for (int idx=0;idx <n;idx++)
      {
        if (arr [idx]==0)
          count++;
        else
        {
          list [num]=arr [idx];
          num++;
        }
      }
      for (int idx=0;idx <count;idx++)
      {
        list [num]=0;
        num++;
      }
      for (int idx=0;idx <n;idx++)
      {
        arr [idx]=list [idx];
        if (idx==n)
          System.out.print(arr [idx]);
        else
          System.out.print(arr [idx]+" ");
      }
    }
}