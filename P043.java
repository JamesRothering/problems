//Question: will this compile? will it run?

abstract class P043_Abstract
{
  static public int i = 100;
}

public class P043
{
  public static void main(String[] argv)
  {
    System.out.println(P043_Abstract.i);
  }
}
























//Answer: yes, yes,
//Principle: The abstract class cannot be instantiated, but it can still
//           be compiled and loaded by the class loader, so it is
//           accessible for static (class) usage.
