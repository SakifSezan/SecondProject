package secondjavaclass;

public class Another_Static {

	public static void main(String[] args) {
		Another_Static.NJ();
		Another_Static tom = new Another_Static();
	    tom.NY();

	}

	public static void NJ() {
		Double t = 11.79;
		Double s = 199.99;
		Double z = t+s;
		System.out.println(z);
		
		
	}
	public void NY() {
		char h = 'S';
		System.out.println(h);
	}
}
