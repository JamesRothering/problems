//Question: will this compile?
public class P009
{
  public static void main(String[] argv)
  {
    Child aChild = new Parent();

    Child aChild2 = (Child) new Parent();
  }//end-main
}

class Parent
{
}

class Child
{}

