package com.example.designPattern.observer;

public class ObserverMain {
  public static void main(String[] args) {
    DataSource dataSource = new DataSource();
    SpreadSheet spreadSheet = new SpreadSheet(dataSource);
    SpreadSheet spreadSheet2 = new SpreadSheet(dataSource);
    Chart chart = new Chart(dataSource);

    dataSource.addObserver(spreadSheet);
    dataSource.addObserver(spreadSheet2);
    dataSource.addObserver(chart);

    dataSource.setValue(1);
    dataSource.setValue(2);
    dataSource.setValue(3);
  }
}

