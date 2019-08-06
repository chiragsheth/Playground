import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in= new Scanner(System.in);
      int size= in.nextInt();
      int arr[]= new int[size];
      for(int i=0;i<size;i++){
        arr[i]=in.nextInt();
      }
      int k=in.nextInt();
      arrange(size,k,arr);
    }   
  public static void arrange(int n,int k,int arr[]){
    int i,j,var;
    //int temp[]=new int[n];
    for(i=0;i<n;i++){
      for(j=i+1;j<n;j++){
        if(arr[i]<arr[j]){
          var = arr[j];
          arr[j]=arr[i];
          arr[i]= var;
        }
      }
    }
    System.out.print(arr[k-1]);
  }
}