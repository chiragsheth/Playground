import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int len=str.length();
    StringBuilder sb=new StringBuilder(str);
    int key=in.nextInt();
    for(int i=0;i<len;i++)
    {
      if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z')
      {
        int offset =sb.charAt(i)-'A';
        offset =(offset-key)%26;
        char ch=(char)(offset+'A');
        sb.setCharAt(i,ch);
      }
      else if(sb.charAt(i)>='a'&&sb.charAt(i)<='z')
      {
        int offset =sb.charAt(i)-'a';
        offset=(offset-key);
        if(offset<0)
          offset=26+offset;
        char ch=(char)(offset+'a');
        sb.setCharAt(i,ch);
      }
    }
    System.out.print(sb);
  }
}