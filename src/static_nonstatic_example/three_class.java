package static_nonstatic_example;

public class three_class {

	public static void main(String[] args) {
		
		three_class am = new three_class();
		am.noy();
		
		three_class.dosh();
		
		three_class pm = new three_class();
		pm.agaro();
		
		three_class.baro();
		
	}
public void noy() {
int a = 45;
int b = 50;
int c = 60;
int d = a+b-c;
System.out.println(d);
	
}
public static void dosh() {
double e = 10.5;
double f = 22.5;
double g = e+f;
System.out.println(g);
		
}
public void agaro() {
char m = 'k';
System.out.println(m);
		
}
public static void baro() {
String boyName = "Rayan Rahman";
String girlName = " and Laiba";
String childName = boyName+girlName;
System.out.println(childName);
	
	
}
	
	
}
