package com.example.designPattern.observer.trading;

public class TradingMain {
  public static void main(String[] args) {
    StatusBar statusBar = new StatusBar();
    StockListView stockListView = new StockListView();

    Notification notification = new Notification();
    notification.addObserver(statusBar);
    notification.addObserver(stockListView);

    StockService stockService1 = new StockService(notification);

    Stock stock1 = new Stock("stock1", 10);
    stockService1.createStock(stock1);

    stock1.setPrice(11);
    stockService1.priceChanged(stock1);
  }
}
