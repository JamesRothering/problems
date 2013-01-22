class P021
{
  public static void main(String[] argv)
  {}
}

class Parent
{
  private void aTest()
  {  }
}

class Child extends Parent
{
  public void aTest()
  {
    System.out.println("aTest here does not override aTest, because it has" +
                       " no visibility of the Parent classes, yet it can " +
                       " still declare a method of the same name. Is " +
                       " this what they call shadowing? ");
  }
}//end-class Child
