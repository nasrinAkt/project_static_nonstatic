package static_nonstatic_example;

public class one_class {

	public static void main(String[] args) {
		
		one_class ny = new one_class();
		ny.ak();
		
		one_class.dui();
		
	
		one_class tx = new one_class();
		tx.tin();
		
		one_class.chaar();
		
		
	}
public void ak() {
int a = 100;
int b = 200;
int c = a+b;
System.out.println(c);
	
}
public static void dui() {
double a = 10.25;
double e = 12.25;
double f = a*e;
System.out.println(f);	
}

public void tin() {
char my = 'n';
System.out.println(my);	
}
	
public static void chaar() {
String firstname = "Nasrin";
String lastname = " Akter";
String fullname = firstname+lastname;
System.out.println(fullname);

}
	
	
	
}
