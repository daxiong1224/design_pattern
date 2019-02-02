package com.hx.behavior.responsibilityChain;

/**
 * 处理类型为type2的请求
 */
public class MyHandler2 extends Handler{
    public MyHandler2(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE2){
            System.out.println(request.getName() + " is handle by MyHandler2!");
        }else{
            if(successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
