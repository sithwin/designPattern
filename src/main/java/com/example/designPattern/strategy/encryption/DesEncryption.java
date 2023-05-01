package com.example.designPattern.strategy.encryption;

public class DesEncryption implements EncryptionStrategy {
  @Override
  public void encrypt(String message) {
    System.out.println("Encrypting message using DES");
  }
}
