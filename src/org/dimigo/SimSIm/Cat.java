package org.dimigo.SimSIm;

public class Cat extends Animal {
    public void bark(){
        System.out.println("야옹");
    }

    public static void main(String[] args) {
        Animal a = new Cat();

        a.bark();

    }
}
