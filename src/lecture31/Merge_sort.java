package lecture31;

public class Merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {7,3,2,15,7,1};
		int []ans = mergesorted(arr,0,arr.length-1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
	public static int []mergesorted(int []arr,int lo, int hi){
		if(lo==hi) {
			int []a= new int [1];
			a[0]=arr[lo];
			return a;
		}
		int mid = (lo+hi)/2;
		int []fs= mergesorted(arr,lo,mid);
		int []ss= mergesorted(arr,mid+1,hi);
		return Merge_twosorted_array(fs,ss);
		
	}
	public static int [] Merge_twosorted_array(int []arr1,int []arr2) {
		int n = arr1.length;
		int m = arr2.length;
		
		int [] ans = new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n && j<m) {
			if(arr1[i]<=arr2[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			}
			else{
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
			while(i<n) {
				ans[k]=arr1[i];
				k++;
				i++;
			}											
			while(j<m) {
				ans[k]=arr2[j];
				k++;
				j++;
			}
		return ans;
	}
}
