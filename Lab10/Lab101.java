package Lab10;

import java.math.BigInteger;

public class Lab101 {
    public static void main(String[] args) {
        // bigNum represents Long.MAX_VALUE
        BigInteger bigNum = new BigInteger(
            "10000000000000000000000000000000000000000000000000");
        // bigNum is now larger than Long.MAX_VALUE
        bigNum.add(BigInteger.ONE);
        
    System.out.println("before loop "+bigNum);
        int count = 1;
        while (count <= 10) {
          if (bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
              bigNum.divide(new BigInteger("3")).equals(BigInteger.ZERO)) {
            System.out.println(bigNum);
            count++;
          }
    
          bigNum = bigNum.add(BigInteger.ONE);
        }
      }
    
}
