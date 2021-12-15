package Lab10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Binteger {
    public static void main(String[] args) {

        //test big integer
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b); // 9223372036854775807 * 2
        //System.out.println(c); 
        //System.out.println(9223372036854775807*2);

         //test big decimal   
         BigDecimal x = new BigDecimal(1.0);
         BigDecimal y = new BigDecimal(3);
         BigDecimal z = x.divide(y, RoundingMode.DOWN);
         System.out.println(z);
        //System.out.println(x.divide(y));

    }
}
