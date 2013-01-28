//Will this compile?

package B;
import A.*;
class Child
{
  Parent aParent;
}
























//Answer: no
//principle: Declaring a type from a different package is an attempt to
//           access the type. But the access for that package is default,
//           and so restricted to only the same package access
