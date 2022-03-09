package CodingBat.Warmup1;

public class Deldel {
    public String delDel(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char result1 = str.charAt(1);
        if (result1 == 'd') {
            return str.replace("del", "");
        } else {
            return str;
        }
    }
}
    //solution
/*     public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }
*/