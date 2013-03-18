//Q: Will this compile?

class P069
{
  static public void testIt()
  {

  }
}

class Child extends P069
{
   public void testIt()
   {
   }
}

//A: No. A method of the same name and signature in a subclass is an attempted
//   override. But overriding is prohibited for static methods.
//  The only possible permutation that will compile is for the sublclass
//  to add the modifier static to the subclass method, and then this is
//  a case of a redefinition of a static method, not a overriding.
//  This implies, in turn, that the compiler will bind to a particular
//  static method, rather than a runtime polymorphic method invocation.

