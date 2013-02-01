//Question: will this compile
public class P051 extends P051Helper implements P051Interface
{
   public static void main(String[] argv)
   {
     P051 aTest = new P051();
     aTest.aMethod2(3);
     System.out.println("everything ran fine");
   }
   void aMethod1();
   void aMethod2(int i) {}
   void aMethod3(String str) {}
}

interface P051Interface
{
  void aMethod1();
  void aMethod2(int i);
  void aMethod3(String str);
}






//Answer: no
//Principle: overriding methods must not assign weaker access privileges
//           aMethod1,2,3 must be public
