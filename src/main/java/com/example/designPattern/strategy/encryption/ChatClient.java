package com.example.designPattern.strategy.encryption;

public class ChatClient {
  private EncryptionStrategy strategy;
  public ChatClient(EncryptionStrategy strategy) {
    this.strategy = strategy;
  }

  public void send(String message) {
    this.strategy.encrypt(message);
  }
}
