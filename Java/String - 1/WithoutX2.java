/**
 * 
 * Given a string, if one or both of the first 2 chars is 'x', return the string
 * without those 'x' chars, and otherwise return the string unchanged. This is a
 * little harder than it looks.
 * 
 * 
 * withoutX2("xHi") → "Hi" withoutX2("Hxi") → "Hi" withoutX2("Hi") → "Hi"
 * 
 */

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.equals("x")) {
            return "";
        }
        if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        }
        if (str.charAt(1) == 'x') {
            String str2 = str.substring(0, 1);
            String str3 = str.substring(2);
            return str2 + str3;
        }
        return str;
    }
}
