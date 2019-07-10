package org.dimigo.SimSIm;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.getTitle());

        book = new Book("미생","윤태호",1000);
        System.out.println(book.getTitle());
        book.setTitle("자바를잡아라");
        System.out.println(book.getTitle());
    }
}
