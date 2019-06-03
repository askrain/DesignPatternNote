package com.company.strategy;


/**
 * 计算接口
 */
public interface CalculateStrategy {
    /**
     * 按距离来算价格
     *
     * @param km 公里
     * @return 返回价格
     */
    int calculatePrice(int km);
}
