package com.example.designPattern.strategy.encryption;

public class Demo {
  public static void main(String[] args) {
    var chatClient = new ChatClient(new DesEncryption());
    chatClient.send("Hello World" );
  }
}
