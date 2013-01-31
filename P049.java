//Question: will the following compile?
//if so, Will it run?
//if so, what will be the output?
public class P049
{
   public static void main(String[] argv)
   {
     P049_Server a_Server = new P049_Server();
     System.out.println("instantiated a Server");
     P049_Client a_Client =  new P049_Client(a_Server);
     System.out.println("instantiated a Client linked to a Server");
     P049_Client a_Client2 = new P049_Client(null);
     System.out.println("instantiated a Client with no Server");
   }
}

class P049_Server {}

class P049_Client throws ServerExistenceException
{
  private P049_Server _a_Server = null;

  P049_Client(P049_Server aServer)
  {
    if (null == aServer) {throw new ServerExistenceException();}
    this._a_Server = aServer;
  }
}

class ServerExistenceException
  extends RuntimeException
{
  ServerExistenceException()
  {
    super("null passed into attempted creation of a Client. Client must have a server");
  }
}




//Answer: will not compile
//Principle: Classes may not define exceptions to be thrown
//           Only methods may define such exceptions
