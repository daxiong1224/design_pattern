package com.hx.behavior.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.request(new FreeState());
        context.request(new BookedState());
    }
}
