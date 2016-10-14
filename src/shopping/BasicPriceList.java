package shopping;

public class BasicPriceList {

	int price ;
	int itemnumbers;
	int totalprice;
	
	

	public BasicPriceList(int price, int itemnumbers) {
		super();
		this.price = price;
		this.itemnumbers = itemnumbers;
	}
	public BasicPriceList(){
		
	}

	public int calculateTotalPrice() {

		totalprice = itemnumbers * price;
		return totalprice;

	}


}
