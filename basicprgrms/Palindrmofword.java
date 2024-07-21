package basicprgrms;

public class Palindrmofword {
	
   static String revword(String word) {
	   
	   String temp=word;
	  char[] chararray=word.toCharArray();
	  String revstring="";
	  for(int i=chararray.length-1;i>=0;i--) {
		   revstring=revstring+chararray[i];
	  }
	  
	  if(temp.equals(revstring)) {
		  System.out.println("it is palindrome");
		  
	  }
	  else {
		  System.out.println("it is not a palindrome");
	  }
	  return revstring;
	  }
  
   
   public static void main(String[] args) {
	String word = "mam";
	
	System.out.println(revword(word));
	
		
	}
}

