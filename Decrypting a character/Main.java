import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner ( System.in ); 
      char ch=in.next ().charAt (0);
      int key=in.nextInt ();
      if (ch>='a'&&ch<='z')
      {
        int offset=ch-'a';
         offset=(offset-key)%26;
        if (offset <0)
          offset=26+offset;
        
        ch=(char)('a'+offset);
      }
      else
      {
        int offset=ch-'A';
        offset=(offset-key)%26;
        ch=(char)('A'+offset);
      }
      System.out.println  (ch);
    }
}