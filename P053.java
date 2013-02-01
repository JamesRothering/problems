//Question: will this compile?
// if so  : will it run?
// if so  : will the inheritance work?
public class P053
{
   int aParentVar = 1;

   void aMethod(int i)
   {
     System.out.println("this is the parent version of aMethod. aParentVar="+
                          this.aParentVar);
   }

   public static void main(String[] argv)
   {
     P053Child aTestChild   = new P053Child();
     int i = 10;
     aTestChild.aMethod(i);
   }
}

class P053Child extends P053
{
  int aParentVar = 2; //override the parent variable

  void aMethod(int i)
  {
    System.out.println("Child version of aMethod. aParentVar=" +
                        this.aParentVar);
  }
}



//Answer:
//Principle: SCJP v6 p 157 states that Inheritance allows a class to be a subclass
//           of a superclass, and thereby inherit public and protected
//           variables of a superclass. What about default-package access
//           variables and methods?
//Concretization: In this SSCCE, we have default access method aMethod(int i)
//             in both a parent and child. Since the signature is the same
//             this is an override. But notice that the child version of the
//             method is invoked at runtime, proving that package access
//             methods are inherited. But package access variables, of course
//             are not inherited, because NO access modifier will make
//             instance variables inherited. 
