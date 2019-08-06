import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    arrange(n,arr);
  }
  public static void arrange(int n,int arr[]){
    int i,j=0,sum=0,max=0;
    int temp[]=new int[n];
    for(i=0;i<n;i++){
      if(i!=n-1)
      {
        if(arr[i+1]>arr[i])
        {
          sum=sum+arr[i];
         // System.out.println(sum);
        }
        else
        {
          //System.out.print("hi");
          temp[j++]=sum+arr[i];
        //  System.out.print(temp[j-1]);
         // System.out.println();
          sum=0;
        }
      }
      else
      {
        temp[j]=sum+arr[i];
       // for(i=0;i<n;i++){
         //System.out.print(temp[j]);
       // }
        maximum(n,temp);
      }
    }
}
  public static void maximum(int n,int temp[])
  {
    int i;int max=0;
    for(i=0;i<n;i++)
    {
      if(temp[i]>max)
        max=temp[i];
    }
    System.out.print(max);
  }
}