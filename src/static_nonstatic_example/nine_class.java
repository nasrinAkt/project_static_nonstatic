package static_nonstatic_example;

public class nine_class {

	public static void main(String[] args) {
	 	nine_class oil = new nine_class();
	 	oil.toy();
	 	
	 	nine_class.doll();
		
	 	nine_class hi = new nine_class();
	 	hi.car();

	 	nine_class.bike();
	 	
	}
public void toy() {
int a = 100;
int b = 200;
int c = 300;
int d = a+b+c;
System.out.println(d);
		
}
public static void doll() {
double e = 780;
double f = 20;
double g = e+f;
System.out.println(g);
	
	
}
public void car() {
char small = 'l';
System.out.println(small);
	
	
}
public static void bike() {
String place = "Bangladesh";
System.out.println(place);
	
	
}


	
	
}
