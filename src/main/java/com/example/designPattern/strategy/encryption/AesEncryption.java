package com.example.designPattern.strategy.encryption;

public class AesEncryption implements EncryptionStrategy {
  @Override
  public void encrypt(String message) {
    System.out.println("Encrypting message using AES");
  }
}
