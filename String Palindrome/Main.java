import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner ( System.in ); 
      String str = in.nextLine ( ); 
      StringBuilder sb= new StringBuilder(str);
      StringBuilder temp= new StringBuilder();
      int len=sb.length ();int j=0;
      for (int i=len-1;i >=0;i--)
      {
        char ch=sb.charAt (i);
        temp.append (ch);
      }
      for (int i=0;i <len;i++)
      {
        if (sb.charAt (i)!=temp.charAt (i))
        {
          j=1;
        }
      }
      if (j==1)
        System.out.println("No");
      else
        System.out.println("Yes");
    } 
}