import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String word =in.next();
    int len2=word.length();
    StringBuilder sb=new StringBuilder(str);
    StringBuilder res=new StringBuilder("");
    int len=sb.length();
    for(int i=0;i<len2;i++)
    {
      for(int j=0;j<len;j++)
      {
        if(word.charAt(i)==sb.charAt(j))
          sb.setCharAt(j,'\0');
        //else
          
      }
    }
    for(int i=0;i<len;i++){
      if(sb.charAt(i)!='\0')
    res.append(sb.charAt(i));
    }
    System.out.print(res);
  }
}