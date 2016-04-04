import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**Class: TrendingPageTest.java
 * @author: Parth Patel
 * @version: 1.0
 * Course : ITEC 3150 Spring 2016 Dr. Cengiz Gunay
 * Date Written: Apr 4, 2016
 * Purpose- to test the class 
 */

public class TrendingPageTest
{
	private Login lg1 = new Login();
	
	private TrendingPage tp1 = new TrendingPage(lg1);

	@Test
	public void testGetLogin()
	{	
		assertEquals(tp1.getLogin(), tp1.login);
		
	}

	

}
