import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int k =in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
      }
      frequency(n,k,arr);
    }
  public static void frequency(int n,int k,int arr[]){
    int i,j;
    for(i=1;i<=k;i++){
      int count=0;
      for(j=0;j<n;j++){
        if(i==arr[j]){
          count++;
        }
      }
      System.out.println(i+" "+count);
    }
  }
}