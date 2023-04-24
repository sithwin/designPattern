package com.example.designPattern.observer;

public class Chart implements DataSourceObserver  {
  private DataSource dataSource;

  public Chart(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void update() {
    System.out.println("Chart got notified: " + dataSource.getValue());
  }
}
