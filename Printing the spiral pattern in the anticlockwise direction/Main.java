import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[][]=new int[n][n];
      spiral(a,n);
     /* for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }*/
    }
  public static void spiral(int a[][],int n)
  {
    int rmin=0,rmax=n-1,cmin=0,cmax=n-1,val=1,i,j;
    while((rmin<=rmax)&&(cmin<=cmax))
    {
      for(i=cmax;i>=cmin;i--)
        a[rmin][i]=val++;
      
      for(i=rmin+1;i<=rmax;i++)
        a[i][cmin]=val++;
      
      for(i=cmin+1;i<=cmax;i++)
        a[rmax][i]=val++;
      
      for(i=rmax-1;i>=rmin+1;i--)
        a[i][cmax]=val++;
      
      rmin++;
      rmax--;
      cmin++;
      cmax--;
    }
     for( i=0;i<n;i++)
      {
        for( j=0;j<n;j++)
        {
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
    }
  
}