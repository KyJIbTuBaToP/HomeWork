package CodingBat.Warmup1;

public class Or35 {
    public boolean or35(int n) {
        if (n%3 == 0 || n%5 == 0){
            return true;
        }else{
            return false;
        }
    }
}
/*
public boolean or35(int n) {
  return (n % 3 == 0) || (n % 5 == 0);
}
 */
