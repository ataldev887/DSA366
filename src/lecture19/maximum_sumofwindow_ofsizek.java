package lecture19;

public class maximum_sumofwindow_ofsizek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,7,5,11,3,2,1};
		int k =3;
		System.out.println(maximumsum(arr,k));
	}
	public static int maximumsum(int []arr,int k) {
		int sum =0;
		//1st window
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		int ans = sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i]; //window grow
			sum-=arr[i-k]; //window small
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
