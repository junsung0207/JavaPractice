package org.dimigo.inheritance;

public class PersonTest2 {
    public static void Greeting(Person p){
        System.out.println(p.toString());
        p.sayHello();
        p.sayBye();
        System.out.println("");
    }

    public static void main(String[] args) {
        Person[] person= {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for(Person p : person) {
            Greeting(p);
        }
    }
}
