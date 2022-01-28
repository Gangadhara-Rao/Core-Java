package gangadhar;

public class Stringbuilder {
	public static void main(String[] args) {
StringBuilder b1=new StringBuilder("Strings");
b1.append("StringBuilder");
b1.append("is a peer class of String ");
b1.append("that provides much of");
b1.append("the functionality of Strings");
StringBuilder str=new StringBuilder("It is used to at the specified index position.");
str.insert(14, "insert text");
StringBuilder str1=new StringBuilder("This method returns the reversed object on which it was called");
str1.reverse();
		System.out.println(b1);
		System.out.println(str);
		System.out.println(str1);
	}

}
