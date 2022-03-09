package CodingBat.Warmup1;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        else {
            return false;
        }
    }

}
/*
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile && bSmile) {
    return true;
  }
  if (!aSmile && !bSmile) {
    return true;
  }
  return false;
  // The above can be shortened to:
  //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
  // Or this very short version (think about how this is the same as the above)
  //   return (aSmile == bSmile);
}
 */
