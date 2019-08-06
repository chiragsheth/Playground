import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner ( System.in ); 
    String str1=in.nextLine ();
    String str2=in.nextLine ();
    int len1=str1.length ();
    int len2=str2.length ();
    if (len2==2)
    System.out.println('3');
    if (len2==3)
      System.out.println('2');
  } 
}