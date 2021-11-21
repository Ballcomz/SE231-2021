package Lab4;

public class Lab4_1 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Coropration.");
        stock1.setPreviousClosingPrice(34.5);
  
        // Set current price
        stock1.setCurrentPrice(34.35);
  
        // Display stock info
        System.out.println("Previous Closing Price: " +
          stock1.getPreviousClosingPrice());
        System.out.println("Current Price: " +
          stock1.getCurrentPrice());
        System.out.println("Price Change: " +
          stock1.getChangePercent() * 100 + "%");
      }
  
}
