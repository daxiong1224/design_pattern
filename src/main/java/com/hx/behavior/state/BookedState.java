package com.hx.behavior.state;

//具体状态：已锁定
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已被锁定！");
    }
}
