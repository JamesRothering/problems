//Q: Will this compile?
//Q: Is this a valid override?
//Q: Ist this a valid redefinition
//Q: Will the compiler allow name duplication in the subclass?

class P064
{
  public static void testStaticOverride(int aVal)
  {

  }
}

class Child extends P064
{
  public void testStaticOverride(int aVal);
  {

  }

}

//A: No
//A: No. Cannot override a static method
//A: No. Redefinition is not permitted of a Static method by a child instance method.
//A: No. The name is prohibited from use. 
