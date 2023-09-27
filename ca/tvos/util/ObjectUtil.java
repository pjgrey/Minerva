/**
 * 
 */
package ca.tvos.util;

import java.util.Comparator;

/**
 * 
 */
public class ObjectUtil {

	private static final Comparator<Object> ncompare = new Comparator<>() {
		@Override
		public int compare(Object lhs, Object rhs) {
			return System.identityHashCode(lhs) - System.identityHashCode(rhs);
		}};
	
	/**
		 * Comparator using System.identityHashCode; provides a consistent ordering for 
		 * object without a natural ordering.
		 */
	public static Comparator<Object> neutralComparator() {
		return ncompare;
	}

	/** 
	 * Identify object; can be using in degugging. */
	public static String objectLabel(Object obj) {
		return obj.getClass().getName() + " [" + Integer.toHexString( System.identityHashCode(obj)).toUpperCase() + "]";
	}
	
	
	
}
