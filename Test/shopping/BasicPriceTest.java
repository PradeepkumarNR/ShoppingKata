package shopping;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicPriceTest {
	BasicPriceList bpl;


	@Before
	public void setUp() throws Exception {


	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_calculate_toltal_price_if_items_are_same_count()
			throws Exception {
		 int price=2;
		 int Itemnumbers=3;
		bpl = new BasicPriceList(Itemnumbers, price);
		assertEquals(6, bpl.calculateTotalPrice());
	
	}
	
	@Test
	public void should_calculate_total_price_when_differetnt_items_have_different_cost() throws Exception {
		
	}





}
