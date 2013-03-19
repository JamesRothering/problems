//Q: Will this compile?


class P070
{
  static int i;
  static public void testIt()
  {
     i = 1; 
  }

  public static void main(String[] args)
  {
    P070 aParent = new P070();
    Child aChild = new Child();

//    aChild = aParent; // downcast aParent to aChild subtype ?
    aParent = aChild; //downcast parent reference to point to a subtype
    aChild.testIt();
    System.out.println("got back i=" + aChild.i);
  }
}

class Child extends P070
{
   static public void testIt()
   {
     i=2;
   }
}

//A: No. There is no inheritance hierarchy in static methods
//notice the deliberate confusion in "downcasting" terminology.
// Downcasting is OF references, from a base class to a sub-class
// Upcasting   is OF references, from a sub-class  to a superclass



