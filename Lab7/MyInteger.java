package Lab7;

public class MyInteger {
    private int value;

  public int getValue() {
    return value;
  }

  public MyInteger(int value) {
    this.value = value;
  }

  public boolean isPrime() {
    return isPrime(value);
  }

  public static boolean isPrime(int num) {	
    if ((num == 1) || (num == 2)) {
      return true;
    }

    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static boolean isPrime(MyInteger o) {
    return isPrime(o.getValue());
  }

  public boolean isEven() {
    return isEven(value);
  }
  
  public boolean isOdd() {
	return isOdd(value); 
  }
  
  public static boolean isEven(int n) {
    return n % 2 == 0;
  }
  
  public static boolean isOdd(int n) {
	return n % 2 != 0;
  }

  public static boolean isEven(MyInteger n) {
    return isEven(n.getValue());
  }

  public boolean equals(int anotherNum) {
    return value == anotherNum;
  }

  public boolean equals(MyInteger o) {
    return value == o.getValue();
  }

}
