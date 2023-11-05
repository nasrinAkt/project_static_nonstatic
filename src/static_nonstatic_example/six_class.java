package static_nonstatic_example;

public class six_class {

	public static void main(String[] args) {
	
		six_class fun = new six_class();
		fun.akush();
		six_class.baish();
		
		six_class moon = new six_class();
		moon.teish();
		six_class.cobbish();
		

	}
public void akush() {
int a = 45;
int b = 55;
int c = a*b;
System.out.println(c);
		
}
public static void baish() {
double d = 55.10;
double e = 65.10;
double f = d+e;
System.out.println(f);
		
}
public void teish() {
char ice = 'c';
System.out.println(ice);
		
}
public static void cobbish() {
String money = "Five hundred";
System.out.println(money);
		
}


}
