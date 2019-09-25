class MyModel1 {
    String s1,s2;
     public MyModel1()
     {
         s1="Features of MyModel 1";
         s2="Camera mega pixels: 2";
     }
}

class MyModel2 extends MyModel1 {
    String s3,s4,s5,s6;
     public MyModel2()
     {
         s3="Features of MyModel 2";
         s4="Camera mega pixels: 5";
         s5="Lock mechanism: Fingerprint";
         s6="Display size: 5";
     }
     
}

class MyModel2T extends MyModel2 {
    String s7,s8,s9;
     public MyModel2T()
     {
         s7="Features of MyModel 2T";
         s8="Camera mega pixels: 16";
         s9="Display size: 6";
     }
}
public class Main 
{
    public static void main(String[] args) 
    {
          MyModel1 m1=new MyModel1();
          System.out.println(m1.s1+"\n"+m1.s2);
          MyModel2 m2=new MyModel2();
           System.out.println(m2.s3+"\n"+m2.s4+"\n"+m2.s5+"\n"+m2.s6);
           MyModel2T m3=new MyModel2T();
            System.out.println(m3.s7+"\n"+m3.s8+"\n"+m3.s5+"\n"+m3.s9);
    }
}