import java.util.Scanner;
public class Main
{
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s2;
        int i;
        for(i=0;i<s1.length();i++)
        {
                  char c=s1.charAt(i);
               System.out.print(c);
                if(c==' ')
                {
                System.out.println("");
                }
               
      
        }
    }
}