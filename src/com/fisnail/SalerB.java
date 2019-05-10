package com.fisnail;

public class SalerB implements ISale {
    @Override
    public void sale(String product) {
        System.out.println("销售B,卖"+product);
    }
}
