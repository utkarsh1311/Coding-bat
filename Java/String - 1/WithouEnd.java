/**
 * Given a string, return a version without both the first and last char of the
 * string. The string may be any length, including 0.
 * 
 * 
 * withouEnd2("Hello") → "ell" withouEnd2("abc") → "b" withouEnd2("ab") → ""I
 */

public class WithouEnd {
    public String withouEnd2(String str) {
        return (str.length() <= 2) ? "" : str.substring(1, str.length() - 1);
    }

}
