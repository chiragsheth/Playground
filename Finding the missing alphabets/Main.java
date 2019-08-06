import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in= new Scanner (System.in);
      String str= in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      int temp[] = new int[26];
      for(int i=0;i<26;i++){
        temp[i]=0;
      }
      for(int i=0;i<str_len;i++){
        if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z'){
          temp[sb.charAt(i)-'A']++;
        }
        if(sb.charAt(i)>='a'&&sb.charAt(i)<='z'){
          temp[sb.charAt(i)-'a']++;
        }
      }
      for(int i=0;i<26;i++){
        if(temp[i]==0){
          char ch=( char)(i+'a');
          System.out.print(ch+" ");
        }
      }
    }
}