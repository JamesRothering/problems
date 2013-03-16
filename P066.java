//Q: Will this compile?
//Q: Is this a valid override?
//Q: Is this a valid redefinition
//Q: Will the compiler allow name duplication in the subclass?

class P066
{
  public static void testStaticOverride(int aVal)
  {

  }
}

class Child extends P066
{
  public void testStaticOverride()
  {

  }

}

//A: Yes!
//A: No. There is no override involved, because the signature is different.
//        that makes this an overloaded method in the subclass.
//A: No. see above. But redefinition IS permitted of a Static method by another
//     static method of the same name & signature.
//A: Yes. But that's because this is an overload, not a override or a redefinition.
//    If we were redefining a static method, The name would be prohibited from use
//    in sublcass instance methods, but not in subclass static methods.
