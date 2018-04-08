/**
 *   File Name: SearchArray.java<br>
 *
 *   Yutaka<br>
 *   Created: Apr 8, 2018
 *   
 */

package org.sqa.arraysMethods;

import java.util.Arrays;

/**
 * SearchArray //ADDD (description of class)
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
public class SearchArray {
	
	int binarySearch01(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(key == arr[mid]) {
				return mid;
			}
			if(key < arr[mid]) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	
	boolean binarySearchIntImbeddedSort02(int[] arr, int searchNum) {
		Arrays.sort(arr);
		return (Arrays.binarySearch(arr, searchNum) >= 0);
	}
	
	int binarySearchImbedded03(int[] arr, int searchNum) {
		Arrays.sort(arr);;
		return Arrays.binarySearch(arr, searchNum);
	}


	

}
