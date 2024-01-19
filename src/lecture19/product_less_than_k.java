package lecture19;

public class product_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,2,3};
		int k =10;
		System.out.println(countnoofsubarray(arr,k));
	}	
	public static int countnoofsubarray(int []arr,int k) {
		int si=0;
		int ei=0;
		int ans=0;
		int p=1;
		while(ei<arr.length) {
			
			//window grow
			p=p*arr[ei];
			
			//window shrink
			while(p>=k && si<=ei) {
				p=p/arr[si];
				si++;	
			}
			//ans calculate
			ans = ans + ei - si + 1;
			ei++;
		}
		return ans;
	}
}
