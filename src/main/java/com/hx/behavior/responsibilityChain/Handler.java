package com.hx.behavior.responsibilityChain;

/**
 * 定义处理请求抽象类
 */
public abstract class Handler {
    protected Handler successor;//实现后继链

    public Handler(Handler successor){
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);
}
