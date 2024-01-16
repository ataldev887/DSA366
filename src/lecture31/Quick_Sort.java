package lecture31;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {9,1,56,-9,56,5,2,68,5,62,3,2,1,3,7};
		int idx = index(arr,0,arr.length-1);
		System.out.println(idx);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int index(int []arr,int lo,int hi) {
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