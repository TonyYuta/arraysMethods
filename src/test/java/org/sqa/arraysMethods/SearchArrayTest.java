/**
 *   File Name: SearchArrayTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Apr 8, 2018
 *   
 */

package org.sqa.arraysMethods;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * SearchArrayTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class SearchArrayTest {
	
	SearchArray sb;
	//int[] arr01 = {15, 20, 30, 45, 50, 55, 60, 75, 90};
	int[] arr01 = {15, 20, 30, 45, 50, 55, 60, 75, 90, 95};
	
	@BeforeClass(alwaysRun = true)
	public void beforeSearchArrayTest() {
		sb = new SearchArray();
		//int[] arr01 = {15, 20, 30, 45, 50, 55, 60, 75, 90};
	}
	
	@AfterClass(alwaysRun = false)
	public void afterSearchArrayTest() {
		
	}
	
	@Test(enabled = true, groups = {"array", "search", "all"}, priority = 0)
	public void test001BinarySearch01() {
		//int[] arr01 = {15, 20, 30, 45, 50, 55, 60, 75, 90};
		Assert.assertEquals(2, sb.binarySearch01(arr01, 30), "index of elem 30 doesn't match to 2");
	}
	
	@Test(enabled = true, groups = {"array", "search", "all"}, priority = 0)
	public void test002BinarySearchIntImbeddedSort02() {
		Assert.assertEquals(2, sb.binarySearchIntImbeddedSort02(arr01, 30), "index of elem 30 doesn't match to 2");
	}
	
	@Test(enabled = true, groups = {"array", "search", "all"}, priority = 0)
	public void test003BinarySearchImbedded03() {
		Assert.assertEquals(2, sb.binarySearchImbedded03(arr01, 25), "index of elem 30 doesn't match to 2");
	}
}
