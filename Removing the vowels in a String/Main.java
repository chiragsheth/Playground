import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    StringBuilder res=new StringBuilder("");
    int len =sb.length();
    for(int i=0;i<len;i++)
    {
      if(sb.charAt(i)=='a'||sb.charAt(i)=='A'||sb.charAt(i)=='e'||sb.charAt(i)=='E'||sb.charAt(i)=='i'||sb.charAt(i)=='I'||sb.charAt(i)=='o'||sb.charAt(i)=='O'||sb.charAt(i)=='u'||sb.charAt(i)=='U')
      {
        res.append("");
      }
      else
      {
        res.append(sb.charAt(i));
      }
         
    }
    System.out.print(res);
  }
}