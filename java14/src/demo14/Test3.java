package demo14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class Student{} 
	public class Test3 {
public static void main(String[] args) {
	System.out.println("string to date");
	String sd = "Friday, 04/03/2021, 10:16:15";
	Date d1 = null;
	try {
		d1 = new SimpleDateFormat("E, dd/mm/yyy, hh:MM:ss").parse(sd);
	}catch (ParseException e) {
		e.printStackTrace();
	}
	System.out.println(d1);
	
	
	
	System.out.println("Date to String");
	Date d = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy, hh:mm:ss");
	String s = formatter.format(d);
	System.out.println(s);
	
	
	
	System.out.println("String to char ---- charAt()");
	String s1 = "WELCOME";
	char c = s1.charAt(3);
	System.out.println("3rd index is: "+c);
	

	
	System.out.println("String to char ---- to char Array()");
	String s2 = "hello";
	char c1[]= s2.toCharArray();
	for(int i=0;i<c1.length;i++) {
		System.out.println(i+"index is: "+c1[i]);
	}
	
	
	System.out.println("Char to string");
    char c2='s';
    String s3 = String.valueOf(c2);
    String s4 = Character.toString(c2);
    System.out.println(s4);
    System.out.println("String is: "+s3);
    
    
    System.out.println("string to object");
    String s5="hai";
    Object obj = s5;
    System.out.println(obj);
    
    
    System.out.println("Object to string");
    Student stu = new Student();
    String str = stu.toString();
    String str1 =String.valueOf(stu);
    System.out.println(str);
    System.out.println(str1);
    
    
    System.out.println("Int to long");
    int i1= 200;
    Long l1 =(long)i1;
    System.out.println(l1);
    Long l = Long.valueOf(i1);
    System.out.println(l1);
}
}
