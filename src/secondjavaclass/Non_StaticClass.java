package secondjavaclass;

public class Non_StaticClass {
	public static void main(String[] args) {
		Non_StaticClass tom = new Non_StaticClass();
		tom.sakif();
		Non_StaticClass jack = new Non_StaticClass();
		jack.sezan();
	}

    public void sakif() {
    	Double a = 10.99;
    	Double b = 12.79;
    	Double c  = a*b;
    	System.out.println(c);
    		
    }
	
    public void sezan() {
    	String x = "Sakif";
    	String y = "Sezan";
    	String z = x+y;
    	System.out.println(z);
    	
    }
    
}
