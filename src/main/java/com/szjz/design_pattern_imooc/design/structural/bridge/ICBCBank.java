package com.szjz.design_pattern_imooc.design.structural.bridge;

/**
 * author:szjz
 * date:2019/7/16
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        //委托给account
        account.openAccount();
        return account;
    }
}
