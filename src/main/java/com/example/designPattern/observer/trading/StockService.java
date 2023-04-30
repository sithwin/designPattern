package com.example.designPattern.observer.trading;

public class StockService {
  private final Notification notification;
  public StockService(Notification notification) {
    this.notification = notification;
  }

  public void createStock(Stock stock) {
    var createdStock = new Stock(stock.getSymbol(), stock.getPrice());
    notification.notifyObserver("add", createdStock);
  }

  public void priceChanged(Stock stock) {
    notification.notifyObserver("priceChanged", stock);
  }
}
