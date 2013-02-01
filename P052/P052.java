//Question: will this compile
public class P052 extends P052Helper implements P052Interface
{
   public static void main(String[] argv)
   {
     P052 aTest = new P052();
     aTest.aMethod2(3);
     System.out.println("everything ran fine");
   }

   public void aMethod2(int i) {}
   public void aMethod3(String str) {}
}

interface P052Interface
{
  void aMethod1();
  void aMethod2(int i);
  void aMethod3(String str);
}






//Answer: yes
//Principle: just because a concrete class fails to implement all the methods
//          of an interface doesn't mean its superclass hasn't already 
//          supplied the mandatory implementation. If a class extends, you
//          must check up the inheritance hierarchy for implementations
//           aMethod1,2,3 must be public
