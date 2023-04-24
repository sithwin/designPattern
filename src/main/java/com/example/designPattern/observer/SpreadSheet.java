package com.example.designPattern.observer;

public class SpreadSheet implements DataSourceObserver {
  private DataSource dataSource;

  public SpreadSheet(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void update() {
    System.out.println("SpreadSheet got notified: " + dataSource.getValue());
  }
}

