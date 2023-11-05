package static_nonstatic_example;

public class five_class {

	public static void main(String[] args) {
		five_class zero = new five_class();
		zero.sotero();
		
		five_class.atharo();
		
		five_class lime = new five_class();
		lime.unish();
		
		five_class.bish();
	}
public void sotero() {
int a = 780;
int b = 850;
int c = a+b;
System.out.println(c);
		
}
public static void atharo() {
double d = 10;
double e = 20;
double f = d+e;
System.out.println(f);
		
}
public void unish() {
char old = 'o';
System.out.println(old);
		
}
public static void bish() {
String grade = "Kindergarten";
System.out.println(grade);
	
	
}



}
