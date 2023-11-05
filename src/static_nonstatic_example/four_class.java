package static_nonstatic_example;

public class four_class {

	public static void main(String[] args) {
	
		four_class wow = new four_class();
		wow.tero();
		
		four_class.cuoddo();
		
		four_class now = new four_class();
		now.ponero();
		four_class.sholo();
		
		
	}
public void tero() {
int a = 780;
int b = 40;
int c = a+b;
System.out.println(c);
		
}
public static void cuoddo() {
double d = 45.50;
double e = 50.50;
double f = d*e;
System.out.println(f);
		
}
public void ponero() {
char initial = 'k';
System.out.println(initial);
		
}
public static void sholo() {
String net = "honey";
System.out.println(net);
	
}
	
	
	
}
