package com.hx.behavior.state;

//具体状态：空闲
public class FreeState implements State{
    @Override
    public void handle() {
        System.out.println("房间空闲中，可以预定！");
    }
}
