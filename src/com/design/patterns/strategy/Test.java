package com.design.patterns.strategy;

public class Test {

    //

    /**
     * 策略模式(Strategy Pattern)是一种行为设计模式， 它能让你定义一系列算法， 并将每种算法分别放入独立的类中， 以使算法的对象能够相互替换。
     * 策略模式定义一系列算法，将每一个算法封装起来，并让它们可以相互替换。策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。
     */
    public static void main(String[] args) {
        //e.g 1
        MemberStrategy strategy = new AdvancedMemberStrategy();
        Price price = new Price(strategy);
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);

        System.out.println();

        // e.g 2
        VIPLevel vipLevel = new MallLevel(300);
        vipLevel.pay(300);
    }
}
