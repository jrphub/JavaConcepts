package com.java.JavaGenerics;
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("woof");
    }

    @Override
    public void identify() {
        System.out.println("I'm a Dog.");
    }
}