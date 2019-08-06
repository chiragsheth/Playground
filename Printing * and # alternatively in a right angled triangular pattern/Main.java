import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n = in.nextInt ( ); 
      int toggle =1;
      for (int row =1;row <=n;row++)
      {
           for (int col=1;col <=row;col++)
           {
                if (toggle==1)
                {
                     System.out.print("*");
                     toggle=0;
                }
             else
             {
                  System.out.print("#");
                  toggle=1;
             }
           }
            System.out.print("\n");
      }
    }
}