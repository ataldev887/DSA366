package backtracking1;

public class queen_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] board = new boolean[4];
		int no_queen=2;
		queen1(board,no_queen,0,"",-1);
	}
	public static void queen1(boolean[] board, int tq,int qpsf,String ans,int idx) {
		//tq---> means total queen we have
		//qpsf---> queen placed so far
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i=idx+1;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				queen1(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ",i);
				board[i]=false;
			}
	}


	}

}
