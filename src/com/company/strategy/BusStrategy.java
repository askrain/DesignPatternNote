package com.company.strategy;


/**
 * 公交车价格计算策略
 */
public class BusStrategy implements CalculateStrategy {
    /**
     * 北京公交车，十公里之内一元钱。超过十公里之后每加一元钱可以乘5公里
     *
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;//超过10公里的价格
        int extraFactor = extraTotal / 5;//超过的距离是5公里的倍数
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
