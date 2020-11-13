package com.design.patterns.strategy;

public class Price {

    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 计算图书的价格
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
}
