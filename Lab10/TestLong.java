package Lab10;

import java.math.BigInteger;

public class TestLong {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
        long x = bigNum.longValue();
        System.out.println("value of x: ");
        System.out.println(x);
        System.out.println("add one x+1");
        System.out.println(x+1);
        System.out.println("add one by biginteger");
        System.out.println(bigNum.add(BigInteger.ONE));

    }
}
