package org.richard.demo03;

public class Client {
    public static void main(String[] args) {
        //host
//        Host host = new Host();
        OtherHost host = new OtherHost();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);

        OtherRent proxy = (OtherRent) pih.getProxy();

        proxy.add();
    }
}
