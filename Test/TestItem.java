import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Class: TestItem.java
 * @author Aboubakar Winston Kone
 */


public class TestItem {

	@Test
	public void test_contructor() {
		Item instance=new Item();
	}
	@Test
	public void test_itemName(){
		Item instance=new Item();
		String name="Orange";
		instance.setItemName(name);
		assertEquals(name, instance.getItemName());
	}
	@Test
	public void test_itemId(){
		Item instance=new Item();
		String id="Orange";
		instance.setItemID(id);
		assertEquals(id, instance.getItemID());
	}
	@Test
	public void test_quantity(){
		Item instance=new Item();
		String quantity="3";
		instance.setQuantity(quantity);
		assertEquals(quantity, instance.getQuantity());
	}
	@Test
	public void test_price(){
		Item instance=new Item();
		String price="340";
		instance.setPrice(price);
		assertEquals(price, instance.getPrice());
	}
	@Test
	public void test_itemDescription(){
		Item instance=new Item();
		String desc="Orange";
		instance.setItemDescription(desc);
		assertEquals(desc, instance.getItemDescription());
	}
}
