package com.design.patterns.template;

public abstract class Template {
	/**
     * 办理业务
     */
    public abstract void handle();
    
    /**
     * 评价
     */
    public abstract void evaluation();
    
    /**
     * 取号
     */
    public void takeNumber() {
        System.out.println("取号成功，请排队等候。");
    }
    
    /**
     * 排队
     */
    public void lineUp() {
        System.out.println("排队中，等待叫号...");
    }
    
    /**
     * 模板方法
     */
    public final void process() {
        takeNumber();
        lineUp();
        handle();
        evaluation();
    }
}