package secondjavaclass;

public class Practice_Now2_NonStatic {

	public static void main(String[] args) {
		Practice_Now2_NonStatic RS =  new Practice_Now2_NonStatic();
		RS.Sakif();
		Practice_Now2_NonStatic BH =  new Practice_Now2_NonStatic();
		BH.Sezan();
		Practice_Now2_NonStatic SS =  new Practice_Now2_NonStatic();
		SS.abc();
		Practice_Now2_NonStatic.xyz();

	}

	public void Sakif() {
		
		String a = "Sakif Sezan";
		System.out.println(a);
	}
	
	public void Sezan() {
		
		System.out.println("Good Afternoon Everyone");
	}
	public void abc() {
		char a = 'R';
		System.out.println(a);
	}
	
	public static void xyz() {
		System.out.println("I'm Practicing Static Methods");
	}
	
}
