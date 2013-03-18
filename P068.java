//Q: Will this compile?

class P068
{
  static public void testIt(int i)
  {

  }
}

class Child extends P068
{
   public void testIt()
   {
   }
}

//A: Yes. A signature change in a method-name of a subclass means that this
//   is an overload, not an attempted override. An override (same signature)
//   would be prohibited for a static method, which cannot be overridden,nor
//   even redefined in a subclass. 
