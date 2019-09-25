public class Main {
	public static void main(String[] args) {
		//Customers c=new Customers(1001,"Saakshi",9000000000,"Banglore","16-Jul-1990","F","Lakme Kajal,Salwar");
		//Suppliers s=new Suppliers(7901,"ABC Traders",8000000000,"Mumbai",10,"Paid",4.75f);
		//Customers co=new Customers(1008,"Rahul",9000000001,"Chennai","27-Jan-1992","M","T-Shirt,Jeans");
		//Suppliers su=new Suppliers(7972,"XYZ Enterprises",800000090,"Kolkata",7,"Unpaid",4.35f);
		Customers c=new Customers();
		c.displayPofile("Saakshi",9000000000L);
		Customers co=new Customers();
		co.displayPofile("Rahul",9000000001L);
		Suppliers s=new Suppliers();
		s.displayPofile("ABC Traders",8000000000L);
		Suppliers su=new Suppliers();
		su.displayPofile("XYZ Enterprises",8000000900L);
		c.editAddress("Saakshi","Bangalore");
		co.editAddress("Saakshi","Coimbatore");
		s.editAddress("ABC Traders","Mumbai");
		su.editAddress("ABC Traders","Delhi");
      c.placeOrder();
		s.increase(10,7,"ABC Traders","XYZ Enterprises");
    }	
}

class Users {
		//write the logic for the class Users	      
}

class Customers extends Users
{
		long id;
		long mo;
		String name,ship,dob,gender,ordh;
        		public void editAddress(String name,String ship)
        		{
        		this.name=name;
        		this.ship=ship;
        	      System.out.println(name+", "+ship);
        		}
		public void placeOrder()
		{
		    System.out.println("Order placed successfully!");
		}
		public void displayPofile(String name,long mo)
        		{
        		    this.name=name;
        		    this.mo=mo;
        		    System.out.println(name+", "+mo);
        		    
        		}
		
}

class Suppliers extends Users {
    long id;
		long mo,itmst;
		String name,billad,feedbk,paymnt;
		public void displayPofile(String name,long mo)
        		{
        		    this.name=name;
        		    this.mo=mo;
        		    System.out.println(name+", "+mo);
        		    
        		}
		public void increase(int a,int b,String s1,String s2)
		{
		    int x=a+5;
		    int y=b+10;
		    System.out.println(s1+", "+x);
		    System.out.println(s2+", "+y);
		}
			public void editAddress(String name,String billad)
        		{
        		this.name=name;
        		this.billad=billad;
        	      System.out.println(name+", "+billad);
        		}
}