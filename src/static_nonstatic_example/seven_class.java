package static_nonstatic_example;

public class seven_class {

	public static void main(String[] args) {
		seven_class top = new seven_class();
		top.pochish();
		seven_class.sabbish();
		
		seven_class down = new seven_class();
		down.sataish();
		seven_class.atash();
		
		
	}
public void pochish() {
int a = 700;
System.out.println(a);
		
}
public static void sabbish() {
double b = 20.50;	
System.out.println(b);

}
public void sataish() {
char name = 'N';
System.out.println(name);
	
}
public static void atash() {
String wish = "Hello Everyone";
System.out.println(wish);
	
}


}
