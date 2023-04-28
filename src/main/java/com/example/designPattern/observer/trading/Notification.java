package com.example.designPattern.observer.trading;

import java.util.ArrayList;
import java.util.List;

public class Notification {
  private List<StockObserver> observers = new ArrayList<>();

  public void addObserver(StockObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(StockObserver observer) {
    observers.remove(observer);
  }

  public void notifyObserver(String event, Stock stock) {
    for (var observer: observers)
      if (event.equals("add"))
        observer.addStock(stock);
      else if (event.equals("priceChanged"))
        observer.priceChanged(stock);
  }
}
