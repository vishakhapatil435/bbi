class Singletone
{
   private static Singletone singleton;

   private Singletone(){}

   public static Singletone getInstance()
   {

      // create object if it's not already created
      if(singleton == null)
	  {
         singleton = new Singletone();
      }

       // returns the singleton object
       return singleton;
   }

   public void getConnection()
   {
       System.out.println("You are now connected to the database.");
   }
}

class SingleToneDemo 
{
   public static void main(String v[])
   {
      Singletone s1;

      // refers to the only object of Database
      s1= Singletone.getInstance();
      
      s1.getConnection();
   }
}
