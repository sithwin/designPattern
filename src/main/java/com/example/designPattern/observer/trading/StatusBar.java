package com.example.designPattern.observer.trading;

import java.util.ArrayList;
import java.util.List;

public class StatusBar {
  private List<Stock> stocks = new ArrayList<>();

  public void addStock(Stock stock) {
    stocks.add(stock);
  }

  public void show() {
    for (var stock: stocks)
      System.out.println(stock);
  }

  public static class TradingMain {
    public static void main(String[] args) {
      StatusBar statusBar = new StatusBar();
      StockListView stockListView = new StockListView();

      Stock stock1 = new Stock("stock1", 10);
      stock1.setPrice(11);


    }
  }
}
