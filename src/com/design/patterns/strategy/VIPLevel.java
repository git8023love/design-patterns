package com.design.patterns.strategy;

/**
 * Vip等级
 */
public interface VIPLevel {

    /**
     * 等级扣扣率
     * @return
     */
    void memberStrategyLevel();

    /**
     *
     */
    void pay(double price);

}
