package tp;

public class MyApp {

	public static void main(String[] args) {
		System.out.println("Hello world");
		m1();
		//m2();
	}
	
	public static void m1() {
		String s1="12.5";
		String s2="3.5";
		double v1,v2,res;
		// calculer addition et afficher le resultat
		v1=Double.parseDouble(s1);
		v2=Double.parseDouble(s2);
		res=v1+v2;
		System.out.println("res="+res);
	}

}
