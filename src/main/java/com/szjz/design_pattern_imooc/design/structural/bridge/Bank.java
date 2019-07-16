package com.szjz.design_pattern_imooc.design.structural.bridge;

/**
 * author:szjz
 * date:2019/7/16
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
