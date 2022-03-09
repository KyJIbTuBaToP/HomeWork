package CodingBat.Warmup1;

public class Front22 {
    public String front22(String str) {
        int char2 = 2;
        if (char2 > str.length()) {
            char2 = str.length();
        }
        String front = str.substring(0, char2);
        return front + str + front;
    }


}
/*
public String front22(String str) {
  // First figure the number of chars to take
  int take = 2;
  if (take > str.length()) {
    take = str.length();
  }

  String front = str.substring(0, take);
  return front + str + front;
}
 */
