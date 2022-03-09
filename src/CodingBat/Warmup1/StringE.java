package CodingBat.Warmup1;

public class StringE {
    public boolean stringE(String str) {
        int count = 0;
        char result = 'e';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == result) {
                count++;
            }
        }
        if (count >= 1 && count <= 3) {
            return true;
        } else {
            return false;
        }
    }
}
/*
public boolean stringE(String str) {
  int count = 0;

  for (int i=0; i<str.length(); i++) {
    if (str.charAt(i) == 'e') count++;
    // alternately: str.substring(i, i+1).equals("e")
  }

  return (count >= 1 && count <= 3);
}
 */