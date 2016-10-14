package shopping;

public class Discount {

	static int discountRate = 40;
	static int item2discountRate = 20;
	public boolean isCoupnCodeMatching;
	public boolean item2Purchased;
	BasicPriceList bpl;
	static int item2and5discount = 30;
	int item2disountPrice;
	

	public Discount(BasicPriceList bpl) {
		this.bpl = bpl;
	}

	public int coupencodDiscount(boolean isCoupnCodeMatching) {
		bpl.calculateTotalPrice();
		if (isCoupnCodeMatching) {
			bpl.totalprice -= discountOncouponCodeMatch(bpl.totalprice);
		} 
		return bpl.totalprice;
	}

	public int discountOncouponCodeMatch(int price) {
		int couponcodediscount = (price * discountRate) / 100;
		return couponcodediscount;
	}

	public int item2Discount(boolean item2Purchased) {
		bpl.calculateTotalPrice();
		if (item2Purchased == true) {
			item2disountPrice = ((bpl.totalprice) * item2discountRate) / 100;
			return item2disountPrice;
		} 
		return bpl.totalprice;
	}

	public int item2and5purchased(boolean ifBothitemsPurchased) {
		bpl.calculateTotalPrice();
		if (ifBothitemsPurchased == true) {
			return discountOn2ItemsPurchase();
		} 
		return bpl.totalprice;
	}

	public int discountOn2ItemsPurchase() {
		int item2and5purchasedprice = ((item2disountPrice + bpl.price) * item2and5discount) / 100;
		return item2and5purchasedprice;
	}

	public int considerAllDiscount(boolean isCoupnCodeMatching2, boolean ifBothitemsPurchased) {
		
		int discount = discountOn2ItemsPurchase();
		int totalPrice = discountOncouponCodeMatch(discount);
		return totalPrice;
	}

}
