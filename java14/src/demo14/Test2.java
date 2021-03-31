package demo14;

public class Test2 {
public static void main(String[] args) {
	String s = "Happy";
	char c ='p';
	int count = 0;
	for(int i=0; i<s.length();i++) {
		if(s.charAt(i)==c)
		{
			count++;
	}
	
	}
System.out.println("Occurance of count P is : "+count);
String s1 = "mummy";
//char c1[] =s.toCharArray();
char c1 ='m';
int count1 = 0;
for(int i1=0; i1<s1.length();i1++) {
	if(s1.charAt(i1)==c1)
	{
		count1++;
}

}
System.out.println("Occurance of count m is : "+count1);
}
}