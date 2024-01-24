package lecture36;

public class Person {
	
	private String name;
	private int age;
	
	//constructor
	public Person() {
		this.name="motu";
		this.age=24;
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void fun() {
		int aadhar_no = 226789;
		System.out.println(this.name+" "+this.age+" "+aadhar_no);
	}
	
	public void SetName(String name) {
		this.name=name;
	}
	public void SetAge(int age) {
		this.age=age;
	}
}
