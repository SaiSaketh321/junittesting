/**
 * 
 */
package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nalla.saisaketh
 *
 */
public class TestAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnitString = new jUnitFunction();
		String result = jUnitString.addStrings("capstone","Project");
		assertEquals("capstoneProject", result);
		
	}

}
