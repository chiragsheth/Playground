import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int len=sb.length();
    //System.out.print(len);
  if(len==25)
    System.out.print("Java full stack");
    else
      System.out.print("I AM STRONG");
    
  }
}