import java.util.*;


class Faculty
{
  public void salary(int a)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+a);
  }
}
class CSE extends Faculty
{
  public void salary(int a)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(a+3000));
  }
}
class IT extends CSE
{
  public void salary(int a)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(a+5000));
  }
}
class ECE extends IT
{
  public void salary(int a)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(a+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
      Scanner S=new Scanner(System.in);
      int a=S.nextInt();
    
    Faculty f=new Faculty();
    f.salary(a);
    CSE c=new CSE();
    c.salary(a);
    IT i=new IT();
    i.salary(a);
    ECE obj = new ECE();
    obj.salary(a);
    
  }
}