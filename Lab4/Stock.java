package Lab4;

public class Stock {
  String symbol;
  String name;
  double previousClosingPrice;
  double currentPrice;

  public Stock() {
  }

  public Stock(String newSymbol, String newName) {
    symbol = newSymbol;
    name = newName;
  }

  public double getChangePercent() {
    return (currentPrice - previousClosingPrice) /
      previousClosingPrice;
  }

  public void setPreviousClosingPrice(double price){
      previousClosingPrice = price;
  }
  public void setCurrentPrice(double cPrice){
      currentPrice = cPrice;
  }

  public double getPreviousClosingPrice(){
      return previousClosingPrice;
  }

  public double getCurrentPrice(){
      return currentPrice;
  }
  public String getName() {
    return name;
}
}
