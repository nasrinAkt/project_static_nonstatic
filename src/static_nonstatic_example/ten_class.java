package static_nonstatic_example;

public class ten_class {

	public static void main(String[] args) {
		ten_class run = new ten_class();
		run.medium();
		
		ten_class.large();
		
		ten_class walk = new ten_class();
		walk.small();
		ten_class.extra();
		
		
	}
public void medium() {
int a = 7;
int b = 8;
int c = a*b;
System.out.println(c);
		
}
public static void large() {
double d = 2.10;
double e = 3.10;
double f = d*e;
System.out.println(f);
	
}
public void small() {
char white = 'w';
System.out.println(white);
		
}
public static void extra() {	
String line = "cross";
System.out.println(line);
	
}
	
	
	
	
}
