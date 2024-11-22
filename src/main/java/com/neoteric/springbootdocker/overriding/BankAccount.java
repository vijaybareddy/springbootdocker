package com.neoteric.springbootdocker.overriding;

public interface BankAccount<T>  extends WithDrawable {

    T getAccountHolder();

    double getBalance();
}