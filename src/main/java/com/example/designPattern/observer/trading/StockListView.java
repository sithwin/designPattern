package com.example.designPattern.observer.trading;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements StockObserver {
  private List<Stock> stocks = new ArrayList<>();

  public void addStock(Stock stock) {
    stocks.add(stock);
  }

  public void show() {
    for (var stock: stocks)
      System.out.println(stock);
  }

  @Override
  public void priceChanged(Stock stock) {
    stocks.stream()
        .filter(s -> s.getSymbol().equals(stock.getSymbol()))
        .findFirst()
        .ifPresent(s -> s.setPrice(stock.getPrice()));

    System.out.println("Price Changed - Refreshing List View");
    show();
  }
}
