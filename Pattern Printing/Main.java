import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int ro=sc.nextInt();
      int i,j;
      for(i=ro;i>0;i--)
      {
        for(j=ro;j>0;j--)
        {
          if(i<=j)
          System.out.print(j);
          else
          System.out.print(i);
        }
          
         System.out.print("\n"); 
      }
      
    }
}