package com.example.designPattern.observer.trading;

public class TradingMain {
  public static void main(String[] args) {
    StatusBar statusBar = new StatusBar();
    StockListView stockListView = new StockListView();

    Stock stock1 = new Stock("stock1", 10);
    Stock stock2 = new Stock("stock2", 20);
    Stock stock3 = new Stock("stock3", 30);

    statusBar.addStock(stock1);
    statusBar.addStock(stock2);
    statusBar.addStock(stock3);

    stockListView.addStock(stock1);
    stockListView.addStock(stock2);
    stockListView.addStock(stock3);

    statusBar.show();
    stockListView.show();

    stock1.setPrice(11);
    stock2.setPrice(21);
    stock3.setPrice(31);

    statusBar.show();
    stockListView.show();
  }
}
