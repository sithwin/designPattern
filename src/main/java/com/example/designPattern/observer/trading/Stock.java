package com.example.designPattern.observer.trading;

public class Stock {
  private final String symbol;
    private float price;

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getSymbol() {
      return symbol;
    }

    public void setPrice(float price) {
      if (this.price != price) {
          this.price = price;
      }
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
