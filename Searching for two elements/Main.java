import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner ( System.in ); 
      int n = in.nextInt ( ); 
      int arr []=new int [n];
      for (int idx = 0;idx <n;idx++)
        arr [idx]=in.nextInt ();
      int ele1=in.nextInt ();
      int ele2= in.nextInt ( ); 
      int match_1=0;
      int match_2=0;
      for(int idx=0;idx <n;idx++)
      {
        if (ele1==arr [idx])
        {
          System.out.println(idx);
          match_1=1;
        }
        if (ele2==arr [idx])
        {
          System.out.println(idx);
          match_2=1;
        }
     
      }
      if (match_1==0)
        System.out.println("-1");
      if (match_2==0)
        System.out.println  ("-1");
    }
}