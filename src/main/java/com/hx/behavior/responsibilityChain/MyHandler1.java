package com.hx.behavior.responsibilityChain;

/**
 * 处理请求为type1的类型
 */
public class MyHandler1 extends Handler{
    public MyHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE1){
            System.out.println(request.getName() + " is handle by MyHandler1!");
        }else{
            if(successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
