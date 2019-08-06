import java.util.Scanner; 
class Main
{
  public static int power (int a,int b)
  {
    int pwr=1;
       for (int count=1;count<=b;count++)
         pwr=pwr*a;
    return pwr;
  }
  public static void main (String args [])
  {
       Scanner in = new Scanner ( System.in ); 
    int n1 = in.nextInt ( ); 
    int n2 = in.nextInt ( ); 
    int pow=power (n1,n2);
    System.out.println(pow);
  }
}