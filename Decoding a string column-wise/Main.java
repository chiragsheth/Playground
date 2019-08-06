import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int len=str.length();
    StringBuilder sb=new StringBuilder(str);
    int col=in.nextInt();
    padX(col,len,sb);
    len=sb.length();
    int row =len/col;
    if(len%col>0)
      row++;
    for(int j=0;j<col;j++)
    {
      for(int i=0;i<row;i++)
      {
        int idx=j+(i*col);
        if(i%2==1)
        {
          int c = (col-1)+(i*col);
           idx=c-j;
        }
        if(idx>=len)
          System.out.print('X');
        else
        System.out.print(sb.charAt(idx));
      }
    }
    //System.out.print(sb);
  }
   static void padX(int col,int len,StringBuilder sb)
   {
     int k=len;
     if(len%col!=0)
       len=(col-(len%col))+len;
     StringBuilder temp=new StringBuilder("");
     for(int i=k;i<len;i++)
       sb.append(' ');
     for(int i=0;i<len;i++)
     {
       if(sb.charAt(i)!=' ')
         temp.append(sb.charAt(i));
       //else
         //temp.append('X');
     }
     sb.setLength(0);
     for(int i=0;i<temp.length();i++)
       sb.append(temp.charAt(i));
   }
}