package com.me.strategy;

import org.springframework.stereotype.Service;

/**
 * @Autor syl
 * @Date 2019/1/31 13:31
 **/
@Service
public class DebitCard extends Card {
    @Override
    protected String getType() {
        return "debit";
    }

    @Override
    protected void exectuTransaction(int cents) {
        System.out.println("doTransaction with debit:" + cents);
    }
}
