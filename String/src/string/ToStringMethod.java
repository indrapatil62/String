package string;

class Student{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name;
	}
}
public class ToStringMethod {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(101);
		s.setName("ABC");
		
		Student s1=new Student();
		s1.setId(102);
		s1.setName("PQR");
		System.out.println(s.toString()+ " "+s1.toString());
	}

}
