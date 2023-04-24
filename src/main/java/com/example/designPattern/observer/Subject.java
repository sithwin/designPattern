package com.example.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
  private List<DataSourceObserver> observers = new ArrayList<>();

  public void addObserver(DataSourceObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(DataSourceObserver observer) {
    observers.remove(observer);
  }

  // should use Generic or Object as parameter type?
  public void notifyObservers(int value) {
    for (DataSourceObserver observer : observers) {
      observer.update(value);
    }
  }
}
