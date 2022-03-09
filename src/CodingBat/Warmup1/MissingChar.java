package CodingBat.Warmup1;

public class MissingChar {
    public String missingChar(String str, int n) {
        String start = str.substring (0, n);
        String back = str.substring (n + 1);
        return start + back;
    }

}
/*
public String missingChar(String str, int n) {
  String front = str.substring(0, n);

  // Start this substring at n+1 to omit the char.
  // Can also be shortened to just str.substring(n+1)
  // which goes through the end of the string.
  String back = str.substring(n+1, str.length());

  return front + back;
}
 */