import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner ( System.in ); 
    int n = in.nextInt ( ); 
    int arr [ ] = new int [ n ]; 
    int max=0;
    for (int idx=0;idx <n;idx++)
    {
      arr [idx]=in.nextInt ();
    }
    if (arr [0]>arr [1])
      max=0;
    else
      max=1;
    for (int idx=2;idx <n;idx++)
    {
      if (arr [idx]>arr [max])
        max=idx;
    }
    System.out.println(max);
  }
}