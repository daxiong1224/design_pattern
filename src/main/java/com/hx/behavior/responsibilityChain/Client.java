package com.hx.behavior.responsibilityChain;

/**
 * 责任链模式
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new MyHandler1(null);
        Handler handler2 = new MyHandler2(handler1);//声明实际处理请求的类

        Request request1 = new Request(RequestType.TYPE1, "request1");//请求一
        handler2.handleRequest(request1);//处理请求一

        Request request2 = new Request(RequestType.TYPE2, "request2");//请求二
        handler2.handleRequest(request2);//处理请求二
    }
}
