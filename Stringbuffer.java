package gangadhar;

public class Stringbuffer {
	public static void main(String[] args)
	{
		StringBuffer b1=new StringBuffer("String");
		b1.append("StringBuffer ");
		b1.append("is a peer class of String ");
		b1.append("that provide much of ");
		b1.append("the functionality of  Strings");
		StringBuffer str = new StringBuffer("It is used to at the specified index position.");
	    str.insert(14, "insert text ");
	    StringBuffer str1 = new StringBuffer("This method returns the reversed object on which it was called.");
	    str1.reverse();
	    System.out.println(b1);
	    System.out.println(str);
	    System.out.println(str1);
		
	}	

}
