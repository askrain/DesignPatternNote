package com.company.strategy;

/**
 * 公交出行价格计算器
 */
public class TraficCalculate {
    CalculateStrategy strategy;

    public static void main(String[] args) {
        TraficCalculate calculate = new TraficCalculate();
//        设置计算策略
        calculate.setStrategy(new SubwayStrategy());
        System.out.println("地铁乘16公里的价格为： " + calculate.calculatePrice(16));
    }

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculatePrice(int km) {
        return strategy.calculatePrice(km);
    }
}
