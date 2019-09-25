import java.util.Scanner;
public class Main
{
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
  int area=sc.nextInt();
      switch(area)
      {
        case 1:
          Scanner sec=new Scanner(System.in);
          int a=sc.nextInt();
          System.out.println(a*a);
          break;
        case 2:
          Scanner soc=new Scanner(System.in);
          int l=sc.nextInt();
          int b=sc.nextInt();
          System.out.println(l*b);
          break;
        case 3:
          Scanner swp=new Scanner(System.in);
          int ba=sc.nextInt();
          int he=sc.nextInt();
          System.out.println((ba*he)/2);
          break;
        case 4:
          Scanner sap=new Scanner(System.in);
          double ra=sc.nextInt();
          double pi=3.1399999999999999;
          System.out.println(pi*(ra*ra));
          break;
        default:
          System.out.println("invalid");
      }
    }
}