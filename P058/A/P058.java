package A;
//default access (package) for the whole class
class P058A
{
  //but with a public method
  public void testIt()
  {
    System.out.println("testIt worked");
  }

  public static void main(String[] args)
  {
        
  }
}

class P058B
{
   public static void main(String[] args)
   {
     P058A aTest = new P058A();
     aTest.testIt();
   }
}
