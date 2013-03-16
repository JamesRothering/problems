//Q: Will this compile?
//Q: Is this a valid override?
//Q: Ist this a valid redefinition
//Q: Will the compiler allow name duplication in the subclass?

class P065
{
  public static void testStaticOverride(int aVal)
  {

  }
}

class Child extends P065
{
  public static void testStaticOverride(int aVal)
  {

  }

}

//A: Yes!
//A: No. Cannot override a static method
//A: Yes. Redefinition IS permitted of a Static method by another
//     static method of the same name & signature.
//A: Yes & No. The name is prohibited from use in sublcass instance methods, but not
//      in subclass static methods.
