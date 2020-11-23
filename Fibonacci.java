import java.util.Scanner;
import java.math.BigInteger;
public class Fibonacci {
  private static BigInteger calc_fib(long n) {
   if (n <= 1)
     return BigInteger.valueOf(n);
    BigInteger a=new BigInteger("0");
    BigInteger b=new BigInteger("1");
    BigInteger temp=new BigInteger("0");
    for(long i=0;i<n-1;i++){
      temp=a.add(b);
      a=b;
      b=temp;
      
    }
    return temp;

  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
   long n = in.nextLong();

    System.out.println(calc_fib(n));
  }
}
