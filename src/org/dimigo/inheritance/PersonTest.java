package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Tom");
        Korean k = new Korean("홍길동");
        Japanese j = new Japanese("다나카");
        Chinese c = new Chinese("왕밍");

        System.out.println(p.toString());
        System.out.println(k.toString());
        System.out.println(j.toString());
        System.out.println(c.toString());
        System.out.println("");

        p.sayHello();
        k.sayHello();
        j.sayHello();
        c.sayHello();
        System.out.println("");

        p.sayBye();
        k.sayBye();
        j.sayBye();
        c.sayBye();
    }
}
