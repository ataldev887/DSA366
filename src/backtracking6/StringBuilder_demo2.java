package backtracking6;

public class StringBuilder_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb = new StringBuilder("hello"); //if we directly write here it increases the capacity	
System.out.println(sb.capacity());
System.out.println(sb.charAt(2));
System.out.println(sb.substring(2,5));
//String builder is comparatively faster than String
//Stringprint();
//StringBuilderPrint();
	}
	public static void StringBuilderPrint() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=100000;i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}
	public static void Stringprint() {
		String s = "";
		for(int i=0;i<=100000;i++) {
			s = s+i;
		}
		System.out.println(s);
	}

}
