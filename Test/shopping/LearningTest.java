package shopping;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LearningTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_calculate_basic_price_when_itemAndNumbers_are_known
	() {
		BasicP bp= new BasicP();
		int numofitems=2;
		int priceOfitem=4;
		
		assertEquals(8, bp.calculatebasicprice(numofitems, priceOfitem));
		
		
	}

}
