package string;


public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("Stri");
		System.out.println(sb2);
		
		StringBuffer sb3=new StringBuffer(10);
		sb3.ensureCapacity(10);
		sb3.append("0123456789101111111111");
		System.out.println(sb3);
				
		StringBuffer sb4=new StringBuffer("ITP");
		sb4.append("Pune");
		System.out.println(sb4);
		
		//StringBuffer sb5="India";
		StringBuffer sb6=new StringBuffer("String");
		System.out.println(sb2.equals(sb6));
//		sb2.append(sb6);
//		System.out.println(sb2);
//		System.out.println(sb2.capacity());
//		System.out.println(sb6.capacity());
//	    System.out.println(sb1.capacity());
//		System.out.println(sb2.compareTo(sb6));
//		System.out.println(sb2.codePointAt(0));
	}
}
