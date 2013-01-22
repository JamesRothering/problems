//Question: Are the return types examples of covariance or contravriance
//    and : is it valid in Java?
public class P005
{
  

}//end-class P005

class Parent
{
  String doSomething(){return new String("test");}
}//end-class Parent

class Child extends Parent
{
  Object doSomething(){return new Object();}
}//end-class Child




















//Answer: it is an example of contravariance, and will not compile in Java,
//   but will return a "return type Object is not compatible with String" error.
//   Only covariance is permitted for return types in Java, and only from version 1.5
