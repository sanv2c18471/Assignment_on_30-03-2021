package demo14;

public class Test1 {
public static void main(String[] args) {
	//long to int 
	System.out.println("Long to int");
    long l = 500;
	int  i = (int)l;
	System.out.println(i);
	
	//int to double
	System.out.println("Int to double");
	int I = 20;
	double d = Double.valueOf(I);
	System.out.println(d);
	
	//double to int
	System.out.println("double to int");
	double D = 12.44;
	int in = (int)D;
	System.out.println(in);
	
//boolean to string
	System.out.println("Boolean to String");
	Boolean  b1 = true;
	Boolean  b2 = false;
	String s = String.valueOf(b1);
	String s1 = Boolean.toString(b2);
	System.out.println(s);
	System.out.println(s1);
}
}
