import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++){
        arr[i]= in.nextInt();
      }
      int k=0;int m=size-1;
      int left= arr[0];
      int flag=0;
      int right =arr[size-1];
      while(k<m){
        //int flag =0;
        //for(int i=0;i<size/2;i++){
          //int j= size-1-i;
          //for(int j=size-1;j>size/2;j--){
           // if(arr[i]
        if(left!=right){
          flag=1;
          break;
        }
        else{
          //for(int i=1,j=s;i<size
          left= arr[++k];right=arr[--m];
        }
    }
      if(flag==0)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}