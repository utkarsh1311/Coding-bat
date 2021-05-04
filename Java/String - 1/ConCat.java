/**
 * 
 * Given two strings, append them together (known as "concatenation") and return
 * the result. However, if the concatenation creates a double-char, then omit
 * one of the chars, so "abc" and "cat" yields "abcat".
 * 
 * 
 * conCat("abc", "cat") → "abcat" conCat("dog", "cat") → "dogcat" conCat("abc",
 * "") → "abc"
 * 
 */

public class ConCat {
    public String conCat(String a, String b) {

        return (a.length() != 0 && b.length() != 0 && a.endsWith(b.substring(0, 1))) ? a + b.substring(1) : a + b;
    }

}
