import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner (System.in);
      String str =in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      int temp[] = new int[75];
      for(int i=0;i<str_len;i++){
        temp[i]=0;
      }
      for(int i=0;i<str_len;i++){
        if(sb.charAt(i)>='A'&& sb.charAt(i)<='Z'){
          char ch = (char)(sb.charAt(i)-'A'+'a');
          sb.setCharAt(i,ch);
        }
        if(sb.charAt(i)>='a'&&sb.charAt(i)<='z'){
          temp[sb.charAt(i)-'a']++;
        }
      }
      for(int i=0;i<str_len;i++){
        if(temp[sb.charAt(i)-'a']!=0){
          //System.out.print(sb.charAt(i));
          System.out.print (sb.charAt(i)+""+temp[sb.charAt(i)-'a']+" ");
          temp[sb.charAt(i)-'a']=0;
        }
      }
    }
}