import java.util.*;

class Item
{
  private int price;
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
  public void sum(int a,int b){
  System.out.println("Total Price is : "+(a*b));
  }
}
class Main
{
  public static void main(String[] args)
  {
      Scanner S=new Scanner(System.in);
      String c=S.nextLine();
      int a=S.nextInt();
      int b=S.nextInt();
    Bill obj = new Bill();
    obj.sum(a,b);
    //write the logic here
  }
}