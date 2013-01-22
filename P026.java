//Question: will this compile?
//     and: what about with the annotation?
public class P026
{
  P026 aObject = new P026();
  public static void main(String[] argv)
  {}

  final void aMethod()
  {
    System.out.println("got here");
  }
}

class Child extends P026
{
//  @Override
  final void aMethod()
  {
    System.out.println("attempting to redefine a final method");
  }
}






//Answer: it will NOT compile, neither with nor without the annotation.
// final methods may not be overridden, nor redefined in a child
//  class.

