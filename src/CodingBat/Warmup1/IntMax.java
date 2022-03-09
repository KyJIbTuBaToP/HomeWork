package CodingBat.Warmup1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        int max = 0;
        max = (Math.max(a, Math.max(b, c)));
        return max;
    }
}
/*
public int intMax(int a, int b, int c) {
  int max;

  // First check between a and b
  if (a > b) {
    max = a;
  } else {
    max = b;
  }

  // Now check between max and c
  if (c > max) {
    max = c;
  }

  return max;

  // Could use the built in Math.max(x, y) function which selects the larger
  // of two values.
}
 */