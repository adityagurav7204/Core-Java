package cource.abstraact;

public interface method {
	
	public abstract void A1();
	public abstract void A2();
    public abstract void A3();
                    
      public static void A4()
      {
    	  System.out.println("its a static methos from class A");
    	  
    	  method a = new method_2();
    	  a.A5();
      }
      private void A5()
      {
    	  System.out.println("its private method from Class A");
      }
      

}
