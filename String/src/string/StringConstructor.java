package string;

public class StringConstructor {

	public static void main(String[] args) {
		String defualtString=new String();
        System.out.println(defualtString);
        String parametrisedString=new String("ABC");
        System.out.println(parametrisedString);
        char array[]= {'I','T','P'};
        String s3=new String(array);
        System.out.println(s3);
        System.out.println(s3.length());
       
//        byte numbers[]= {65,66,67,45};
//        String s4=new String(numbers);
//        System.out.println(s4);
        
        StringBuffer sb=new StringBuffer("XYZ");
        String s5=new String(sb);
	        
	       
		}

	}
