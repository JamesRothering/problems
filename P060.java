//Q: will this compile? Is it a valid override?
public class P060
{
  public void test() {}
}

public class Child extends P060
{
  public String test() {}
}

//A: No, it won't compile, because having the same signature means
//   it has to be a override,not an overload
//   But a valid overload must have the same return value
//   or a covariant return value (that is, a subtype)
