package com.design.patterns.strategy;

public class MallLevel implements VIPLevel {

    private MemberStrategy memberStrategy;
    private int scope;

    public MallLevel(int scope) {
        this.scope = scope;
    }

    @Override
    public void memberStrategyLevel() {
        if (scope < 100) {
            memberStrategy = new PrimaryMemberStrategy();
        } else if(scope >= 100 && scope < 500) {
            memberStrategy = new IntermediateMemberStrategy();
        } else {
            memberStrategy = new AdvancedMemberStrategy();
        }
    }

    @Override
    public void pay(double price) {
        memberStrategyLevel();
        double quote = memberStrategy.calcPrice(price);
        System.out.println("图书的最终价格为：" + quote);
    }


}
