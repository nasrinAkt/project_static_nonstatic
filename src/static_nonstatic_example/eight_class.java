package static_nonstatic_example;

public class eight_class {

	public static void main(String[] args) {
		eight_class town = new eight_class();
		town.unotrish();
		eight_class.trish();
		
		eight_class local = new eight_class();
		local.aktrish();
		eight_class.bottrish();

	}
public void unotrish() {
int a = 45;
int b = 56;
int c = a+b;
System.out.println(c);
		
}
public static void trish() {
double d = 10.70;
double e = 20.30;
double f = d+e;
System.out.println(f);
		
}	
public void aktrish() {
char way = 'l';
System.out.println(way);
		
}	
public static void bottrish() {
String line = "saving life";
System.out.println(line);
	
	
}	
	
	
}
