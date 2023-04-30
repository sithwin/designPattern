package com.example.designPattern.observer.trading;

public interface StockObserver {
  void addStock(Stock stock);
  void priceChanged(Stock stock);
}
