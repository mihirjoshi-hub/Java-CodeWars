public class DRoot {
    public static int digital_root(int n) {
      return n < 10 ? n : digital_root(digital_root(n/10)+n%10);
    }
  }
  