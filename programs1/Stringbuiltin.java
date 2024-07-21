package programs1;

public class Stringbuiltin {
public static void main(String[] args) {
	String str="RajaRamMohanRoy";
	String res1=str.toUpperCase();
	System.out.println(res1);
	
	String res2=str.toLowerCase();
	System.out.println(res2);
	
	int res3=str.length();
	System.out.println(res3);
	
	boolean res4=str.startsWith("Raja");
	System.out.println(res4);
	
	res4=str.startsWith("roja");
	System.out.println(res4);
	
	res4=str.endsWith("Roy");
	System.out.println(res4);
	
	
	res4=str.endsWith("Boy");
	System.out.println(res4);
	
	boolean res5=str.contains("Mohan");
	System.out.println(res5);
	
	
	res5=str.contains("Rohan");
	System.out.println(res5);
	
	char res6=str.charAt(6);
	System.out.println(res6);
	
	int res8=str.indexOf("a");
	System.out.println(res8);
	
	char[] arr=str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	
}}
