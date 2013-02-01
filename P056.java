//Question: will this compile?
// if so  : will it run?
// if so  : will the inheritance work?
public class P056
{
   private int aParentVar = 1;

   private void aMethod(int i)
   {
     System.out.println("this is the parent version of aMethod. aParentVar="+
                          this.aParentVar);
   }

   public static void main(String[] argv)
   {
     P056Child aTestChild   = new P056Child();
     int i = 10;
//     aTestChild.aMethod(i);
   }
}

class P056Child extends P056
{
  private int aParentVar = 2; //override the parent variable

  private void aMethod(int i)
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
//Concretization: In this SSCCE, we have private access method aMethod(int i)
//             in both a parent and child. Since the signature is the same
//             this is an override. But notice that this will not compile
//             showing that private access methods can not be overriden
 
