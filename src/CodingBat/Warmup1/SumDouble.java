package CodingBat.Warmup1;

public class SumDouble {
    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        else {
            return a + b;
        }
    }

}
/*
public int sumDouble(int a, int b) {
  // Store the sum in a local variable
  int sum = a + b;

  // Double it if a and b are the same
  if (a == b) {
    sum = sum * 2;
  }

  return sum;
}
 */