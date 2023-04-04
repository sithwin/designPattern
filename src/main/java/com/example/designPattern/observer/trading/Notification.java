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

  public void notifyObserver() {
    for (var observer: observers)
      observer.priceChanged();
  }
}
