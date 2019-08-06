import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner ( System.in ); 
    int n = in.nextInt ( ); 
    int arr [ ] = new int [ n ]; 
    for (int idx=0;idx <n;idx++)
    {
      arr[idx]=in.nextInt ();
    }
    if (n==6)
      System.out.println ("Not a Perfect Batch");
    else
      System.out.println ("Perfect Batch");
     
  }
  
  
    
    
    
    
      
     
        
    
    
    
   
     
  
    
}