package lecture31;

public class quick_sort_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {9,1,56,-9,56,5,2,68,5,62,3,2,1,3,7};
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void quicksort(int []arr, int lo, int hi) {
		if(lo>=hi) {
			return;
		}
		int idx = partition(arr,lo,hi);
		quicksort(arr,0,idx-1);
		quicksort(arr,idx+1,hi);
	}
	public static int partition(int []arr,int lo,int hi) {
		int last_element = arr[hi];
		int idx = lo;
		for(int i=lo;i<hi;i++) {
			if(arr[i]<=last_element) {
				// i , idx 
				int t = arr[i];
				arr[i]=arr[idx];
				arr[idx]=t;
				idx++;
			}
		}
			//idx , hi 
			int t = arr[idx];
			arr[idx]=arr[hi];
			arr[hi]=t;
			return idx;
		}

}
