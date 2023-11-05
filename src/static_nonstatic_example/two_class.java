package static_nonstatic_example;

public class two_class {

	public static void main(String[] args) {
		
		two_class bx = new two_class();
		bx.pach();
		
		two_class.soy();
		
		two_class pv = new two_class();
		pv.sat();
		
		two_class.aat();
		
		
	}

public void pach() {
int a = 700;
int b = 800;
int c = a*b;
System.out.println(c);
		
}
	
public static void soy() {
double v = 45.50;
double z = 50.50;
double b = v*z;
System.out.println(b);
	
		
}
public void sat() {
char er = 'k';
System.out.println(er);
		
}

public static void aat() {
String city = "Jamaica,";
String state = " New York";
String address = city+state;
System.out.println(address);
	
	
}


	
}
