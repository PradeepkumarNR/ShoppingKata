package shopping;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiscountTest {

	BasicPriceList bpl;
	Discount discount;

	@Before
	public void setUp() throws Exception {
		bpl = new BasicPriceList();
		discount = new Discount(bpl);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_discount_if_couponcode_match() {

		bpl.itemnumbers = 2;
		bpl.price = 3;
		boolean isCoupnCodeMatching = true;
		assertEquals(2, discount.coupencodDiscount(isCoupnCodeMatching));

	}

	@Test
	public void should_discount_if_itemnumber2_is_purchased() {
		bpl.itemnumbers = 5;
		bpl.price = 2;
		boolean isitem2Purchased = true;
		assertEquals(2, discount.item2Discount(isitem2Purchased));
	}

	@Test
	public void should_discount_if_item2_and_item5_are_purchased()
			throws Exception {
		bpl.price = 10;
		discount.item2disountPrice = 2;
		boolean ifBothitemsPurchased = true;
		assertEquals(3, discount.item2and5purchased(ifBothitemsPurchased));

	}
	
	@Test
	public void should_give_total_price_when_coupencode_matching_and_purchaseditem2and5
	() throws Exception {
		discount.item2disountPrice=2;
		bpl.price=10;
		boolean isCoupnCodeMatching = true;
		boolean ifBothitemsPurchased = true;
		assertEquals(1, discount.considerAllDiscount(isCoupnCodeMatching, ifBothitemsPurchased));
		
	}

}
