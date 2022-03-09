package CodingBat.Warmup1;

public class BackAround {
    public String backAround(String str) {
        int last = str.length()-1;
        char ch = str.charAt(last);
        return ch+str+ch;
    }

}
/*
public String backAround(String str) {
  // Get the last char
  String last = str.substring(str.length() - 1);
  return last + str + last;
}
 */
