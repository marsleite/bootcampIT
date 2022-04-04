package br.com.bank.entity;

import java.math.BigDecimal;

public class Account {

  private int number;
  private String holderName;
  private BigDecimal depositAmount = BigDecimal.valueOf(0);
  private static final double TAXA = 5.00;

  public Account() {
  }

  public Account(int number, String holderName) {
    this.number = number;
    this.holderName = holderName;
  }

  public Account(int number, String holderName, double depositAmount) {
    this.number = number;
    this.holderName = holderName;
    this.depositAmount = BigDecimal.valueOf(depositAmount);
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public BigDecimal getDepositAmount() {
    return depositAmount;
  }

  public void setDepositAmount(BigDecimal depositAmount) {
    this.depositAmount = depositAmount;
  }

  public void retiredDepositAmount(BigDecimal sacar) {
    this.depositAmount.subtract(sacar).subtract(BigDecimal.valueOf(TAXA));
  }
}
