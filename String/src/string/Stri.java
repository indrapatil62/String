package string;

final class MyClass
{
	final int number;
	public MyClass(int number) {	
		this.number=number;
	}
	public int getNumber(){
		return this.number;
	}
}
public class Stri {

	public static void main(String[] args) {
		MyClass class1=new MyClass(10);
		System.out.println(class1.getNumber());
		MyClass class2=new MyClass(20);
		System.out.println(class2.getNumber());	
		String S1="i";
		String S2="p";
		S1.concat(S2);
		System.out.println(S1);
	}

}

