package com.fisnail;

public class SalerA implements ISale {
    @Override
    public void sale(String product) {
        System.out.println("销售A,卖"+product);
    }
}
