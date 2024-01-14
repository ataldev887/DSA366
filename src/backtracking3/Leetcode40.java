package backtracking3;
import java.util.*;
public class Leetcode40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,1,2,7,6,1,5};
		int target =8;
		Arrays.sort(arr);
		List <Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		printcombination(arr, target,ll,0,ans);
		System.out.println(ans);

	}
	public static void printcombination(int []coin , int amount ,List <Integer> ll, int idx, List<List<Integer>> ans) {
		//base case
		if(amount ==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=idx;i<coin.length;i++) {
			if(i!=idx && coin[i]==coin[i-1]) {
				continue;
			}
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				printcombination(coin,amount-coin[i],ll,i+1,ans);
				ll.remove(ll.size()-1);
			}
		}
	}
}

