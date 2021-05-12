/**
 * 
 * Given a string, if the first or last chars are 'x', return the string without
 * those 'x' chars, and otherwise return the string unchanged.
 * 
 * 
 * withoutX("xHix") → "Hi" withoutX("xHi") → "Hi" withoutX("Hxix") → "Hxi"
 * 
 */
public class WithoutX {
    public String withoutX(String str) {
        if (str.equals("x")) {
            return "";
        }
        if (str.endsWith("x") && str.startsWith("x")) {
            return str.substring(1, str.length() - 1);
        } else if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        } else if (str.startsWith("x")) {
            return str.substring(1);
        }
        return str;
    }
}