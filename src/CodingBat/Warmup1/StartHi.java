package CodingBat.Warmup1;

public class StartHi {
    public boolean startHi(String str) {
        int take = 2;
        if (take > str.length()){
            take = str.length();
        }
        if (str.substring(0, take).equals("hi")) {
            return true;
        }
        else {
            return false;
        }
    }

}
/*
public boolean startHi(String str) {
  // First test if the string is not at least length 2
  // (so the substring() below does not go past the end).
  if (str.length() < 2) return false;

  // Pull out the string of the first two chars
  String firstTwo = str.substring(0, 2);

  // Test if it is equal to "hi"
  if (firstTwo.equals("hi")) {
    return true;
  } else {
    return false;
  }
  // This last part can be shortened to: return(firstTwo.equals("hi"));
}
 */