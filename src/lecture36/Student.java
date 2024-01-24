package lecture36;

public class Student {
	private String name="kirti";
	private int age=25;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) throws Exception{
//		if(age<0) {
//			throw new Exception("pagal hai age kabhi -ve nhi hota");
//		}
//		this.age = age;
//	}
	public void setAge(int age){
		try {
		if(age<0) {
			throw new Exception("pagal hai age kabhi -ve nhi hota");
		}
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("hi dev this side");
		}
		this.age = age;
	}

}
