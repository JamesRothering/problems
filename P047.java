//Will this execte?
//if so, what will it print?
public class P047
{
  public static void main(String[] argv)
  {
    Test aTest = new Test();
    aTest.methodA(3);
    aTest.methodA(2,3);
    aTest.methodA();
    aTest.methodA(2,3,5,9);
  }
}

class Test
{
  void methodA(int i)        {System.out.println("2");}
  void methodA(int... i)     {System.out.println("3");}
  void methodA(int i, int j) {System.out.println("4");}
  void methodA()             {System.out.println("5");}
}






//Answer: yes, 
//Answer: 2, 4, 5, 3
//Principle: order of overloaded method signature declaration is irrelevant
//  if an explicit match is found, it is choosen over the vararg overloading
