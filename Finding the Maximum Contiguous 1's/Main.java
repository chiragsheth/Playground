import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      ones(n,arr);
    }
  public static void ones(int n,int arr[])
  {
    int i,j=0,count=0,maximum=0;
    int max[]=new int[n];
    for(i=0;i<n;i++)
    {
      if(arr[i]==1)
      {
        count++;
      }
      else
      {
        max[j++]=count;
      }
    }
    for(i=0;i<n;i++)
    {
      if(maximum<max[i])
        maximum=max[i];
    }
    System.out.print(maximum);
  }
}