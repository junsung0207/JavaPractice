package org.dimigo.inheritance;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void sayBye(){
        System.out.println("Bye");
    }

    public String toString(){
        return "저는 " + name + "입니다.";
    }

}
