package backtracking6;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringbuilder is usually of 16 capacity but if we add more it increases its size
		//with formula old length*2+2 thats why new size will be 34
StringBuilder sb = new StringBuilder();
sb.append("Hello");  //append is used to add
System.out.println(sb);
sb.append("Hello");
System.out.println(sb);
// System.out.println(sb.reverse()); //used to reverse the string
sb.append("hellooo");
System.out.println(sb);
String s = sb.toString(); //builder to string
System.out.println(sb.length());
System.out.println(sb.capacity()); //used to get the capacity of stringbuilder
	}

}
