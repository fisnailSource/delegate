package com.fisnail;

import java.util.HashMap;
import java.util.Map;

//销售经理
public class SalesManager implements ISale{
    private Map<String,ISale> salers = new HashMap<String,ISale>();
    public SalesManager() {
        salers.put("电脑",new SalerA());
        salers.put("打印机",new SalerB());
    }
    @Override
    public void sale(String product) {
        salers.get(product).sale(product);
    }
}
