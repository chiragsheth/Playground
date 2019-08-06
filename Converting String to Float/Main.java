import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in =new Scanner(System.in);
    //double n=in.nextDouble();
    //System.out.printf("%.6f",n);
    String str=in.next();
    StringBuilder sb= new StringBuilder(str);
    int n=sb.length();int i=0;
    //System.out.print(n);
    while(n>0){
      if(sb.charAt(i)=='.'){
         System.out.print(".");i++;n--;
      }
         else{
      int n1= sb.charAt(i++)-'0';
      System.out.print(n1);n--;
         }
    }
  }
}