package MisysRemainingProblems;

public class MaxProfit {
public static void main(String[] args) {
	int buysell[]= {400, 180, 310, 40, 535, 695};
	int minBuyPrice=buysell[0],maxSellPrice=buysell[1],maxProfit=maxSellPrice-minBuyPrice,buyhour=1,sellhour=2;
		for(int i=0;i<buysell.length;i++) {
			int buyprice=buysell[i];
			for(int j=i+1;j<buysell.length;j++) {
				int sellPrice=buysell[j];
				if(maxProfit<(sellPrice-buyprice)) {
					buyhour=i;
					sellhour=j;
					minBuyPrice=buysell[i];
					maxSellPrice=buysell[j];
					maxProfit=maxSellPrice-minBuyPrice;
				}
			}
		}
		System.out.println("Max Profit that can be obtained is:"+maxProfit+" by buying at: "+(buyhour+1)+" hour at price:"+minBuyPrice+" and selling at: "+(sellhour+1)+" hour at price:"+maxSellPrice);
	}
}
