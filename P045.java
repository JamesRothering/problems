//Question: will this compile?
interface Example
{
  void doFirstThing(int i);
  void doSecondThing(String str);
}

class Test implements Example
{
  void doFirstThing(int i) {}
  void doSecondThing(String str) {}
}
























//Answer: no
//Principle: interface definitions are implicitly "public asbstract," while
//           the implementations above are implicitly package (the default)
//           access. But a the overriding method of a subclass must
//           be as friendly or friendlier than it's superclass method. 
