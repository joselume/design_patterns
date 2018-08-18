package com.realpe.designpatterns.vendingmachine;

public interface IState {
  public void insertDollar( VendingMachine vendingMachine);
  public void ejectMoney( VendingMachine vendingMachine);
  public void dispense( VendingMachine vendingMachine);
}
