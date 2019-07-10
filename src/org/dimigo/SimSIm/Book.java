package org.dimigo.SimSIm;

public class Book {
    private String title = "바람의 딸";
    private String author = "한비야";
    private int page = 500;

    public Book(){

    }

    public Book(String title, String author, int page){
        this.author = author;
        this.title = title;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
