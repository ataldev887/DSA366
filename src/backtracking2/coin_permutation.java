package backtracking2;

public class coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []coin = {2,3,5,6};
		int amount =10;
		printpermutation(coin, amount,"");
	}
	
	public static void printpermutation(int []coin , int amount , String ans) {
		//base case
		if(amount ==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<coin.length;i++) {
			if(amount>=coin[i]) {
				printpermutation(coin,amount-coin[i],ans+coin[i]);
			}
		}
	}

}
