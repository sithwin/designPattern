package com.example.designPattern.observer.trading;

public class StockHandler {
  private Stock stock;

  public StockHandler(Stock stock) {
    this.stock = stock;
  }

  public void priceChanged(float price) {
    this.stock.setPrice(price);
  }
}
