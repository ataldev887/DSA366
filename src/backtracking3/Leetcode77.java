package backtracking3;

import java.util.ArrayList;
import java.util.List;

public class Leetcode77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] board = new boolean[4];
		int no_queen=2;
		List <Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		queen1(board,no_queen,0,-1,ll,ans);
		System.out.println(ans);
	}
	public static void queen1(boolean[] board, int tq,int qpsf,int idx,List <Integer> ll,List<List<Integer>> ans) {
		//tq---> means total queen we have
		//qpsf---> queen placed so far
		if(tq==qpsf) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=idx+1;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				ll.add(i+1);
				queen1(board,tq,qpsf+1,i,ll,ans);
				ll.remove(ll.size()-1);
				board[i]=false;
			}
	}
	}
}
