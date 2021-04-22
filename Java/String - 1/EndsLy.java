/**
 * 
 * Given a string, return true if it ends in "ly".
 * 
 * 
 * endsLy("oddly") → true endsLy("y") → false endsLy("oddy") → false
 */

public class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        return (str.substring(str.length() - 2).equals("ly")) ? true : false;
    }
}
