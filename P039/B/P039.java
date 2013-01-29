//Question: will this compile?
import A.*;
class Child extends Parent
{}
























//Answer: no
//Principle: attempting to extend a class requires visibility of the class,
//          but the parent class is in another package with default access
