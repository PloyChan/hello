package org.example;

public class Hello implements HelloProvider{
    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
