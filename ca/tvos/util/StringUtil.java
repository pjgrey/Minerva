/**
 * 
 */
package ca.tvos.util;

import java.util.Arrays;
import java.util.Objects;

/**
 * Utility methods for <code>String</code> operations.  All methods are static.
 */
public final class /* static */ StringUtil {

	/** Empty <code>String</code> array. */
	public static final String[] EMPTY_STRING_ARRAY = new String[0];

	/** Empty <code>String</code>. */
	public static final String EMPTY_STRING = "";

	/** Copy a <code>String</code> array. */
	public static String[] copy(String[] src) {
		return Arrays.copyOf(Objects.requireNonNull(src), src.length);
	}

	/**
	 * Concatenate two <code>String</code> arrays and return a <code>String</code>
	 * array with the result.
	 * 
	 * @throws IndexOutOfBoundsException if passed an invalid array index.
	 */
	private static String[] concat(String[] lhs, int lhs0, int lhslen, String[] rhs, int rhs0, int rhslen) {
		Objects.requireNonNull(lhs);
		Objects.requireNonNull(rhs);
		String[] result = new String[lhslen + rhslen];
		System.arraycopy(lhs, lhs0, result, 0, lhslen);
		System.arraycopy(rhs, rhs0, result, lhslen, rhslen);
		return result;
	}

	/**
	 * Concatenate two <code>String</code> arrays and return a <code>String</code>
	 * array with the result.
	 * 
	 * @throws IndexOutOfBoundsException if passed an invalid array index.
	 */
	public static String[] concat(String[] lhs, String[] rhs) {
		return concat(lhs, 0, lhs.length, rhs, 0, rhs.length);
	}

	/**
	 * Concatenate two <code>String</code> arrays and return a <code>String</code>
	 * array with the result.
	 * 
	 * @throws IndexOutOfBoundsException if passed an invalid array index.
	 */

	public static String[] concat(String[] lhs, int lhs0, int lhslen, String[] rhs) {
		return concat(lhs, lhs0, lhslen, rhs, 0, rhs.length);
	}

	/**
	 * Concatenate two <code>String</code> arrays and return a <code>String</code>
	 * array with the result.
	 * 
	 * @throws IndexOutOfBoundsException if passed an invalid array index.
	 */
	public static String[] concat(String[] lhs, String[] rhs, int rhs0, int rhslen) {
		return concat(lhs, 0, lhs.length, rhs, rhs0, rhslen);
	}

	/**
	 * Capitalize a <code>String</code>. If the <code>String</code> starts with a
	 * lower case letter, return a new <code>String</code> with the first letter
	 * converted to upper case in the default Locale, otherwise return the same value.
	 */
	public static String capitalize(String s) {
		Objects.requireNonNull(s);
		if (s.isEmpty())
			return EMPTY_STRING;
		else {
			char ch0 = s.charAt(0);
			if (Character.isLowerCase(ch0))
				return Character.toUpperCase(ch0) + s.substring(1);
			else
				return s;
		}
	}

	// do not instantiate; static members only
	private StringUtil() {
	}

}
