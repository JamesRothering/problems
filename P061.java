//will this compile?

interface Tryable
{
  void tryThis(int aVal);
  void tryThat(int aVal);
}


class P061 implements Tryable
{
  void tryThis(int aValue) {}
  void tryThat(int aValue) {}
}



//A: No, because the interface methods are implicitly public abstract
//   but the implementation class, in failing to specify an access
//   modifier, has defined them to be package access, which does not
//   fulfil the contract of the interface. They must be publicly
//   accessible.
